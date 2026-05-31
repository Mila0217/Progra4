package sistemamakeup;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("   SISTEMA DE GESTIÓN DE MAQUILLAJE   ");
        System.out.println("=================================================");

        // 1. CARGAR CATÁLOGO DE PRODUCTOS DESDE MYSQL
        System.out.println("\n[BD] Conectando a MySQL para cargar catálogo de productos...");
        ProductoDAO prodDAO = new ProductoDAO();
        List<Producto> catalogo = prodDAO.obtenerCatalogo(); 

        // Validación por si la base de datos está vacía o apagada en XAMPP
        if (catalogo.isEmpty()) {
            System.out.println("\n[ALERTA] No se pudieron cargar los productos.");
            System.out.println("Asegúrese de que XAMPP esté encendido y la tabla 'productos' tenga datos.");
            scanner.close();
            return;
        }

        // 2. SISTEMA OBSERVER: CARGAR CLIENTES Y NOTIFICAR DESCUENTOS
        System.out.println("\n[BD] Cargando lista de clientes suscritos al boletín...");
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> listaClientesBD = clienteDAO.obtenerClientesSuscritos();

        // Creamos la tienda que actuará como el "Sujeto" (Subject) a observar
        TiendaMaquillaje tienda = new TiendaMaquillaje("Glamour Makeup Store");

        // Suscribimos de forma dinámica a todos los clientes extraídos de MySQL
        if (!listaClientesBD.isEmpty()) {
            for (Cliente c : listaClientesBD) {
                tienda.suscribir(c);
            }
            
            // Disparamos la notificación mensual automática 
            String promocionDelMes = "¡Especial de Mayo! 20% de descuento en Paletas de Ojos y 10% en Bases de Rostro.";
            tienda.notificarDescuentosMes(promocionDelMes);
            
            System.out.println("=================================================");
            System.out.println("Presione ENTER para continuar al sistema de facturación...");
            scanner.nextLine();
        } else {
            System.out.println("[Aviso] No hay clientes registrados en la BD para notificar.");
        }

        // 3. CAPTURA DE DATOS DEL CLIENTE ACTUAL PARA LA VENTA Y REGISTRO EN BD
        System.out.println("\n=================================================");
        System.out.println("          APERTURA DE NUEVA VENTA                ");
        System.out.println("=================================================");
        System.out.print("Ingrese el nombre del cliente comprador: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese el email del cliente comprador: ");
        String emailCliente = scanner.nextLine();

        // A) Creamos el objeto cliente en Java
        Cliente clienteActual = new Cliente(nombreCliente, emailCliente);

        // B) Guardamos este cliente recién ingresado directamente en MySQL
        clienteDAO.insertarCliente(clienteActual);

        // C) Creamos la transacción de venta como lo hacías normalmente
        Venta transaccion = new Venta(9001, clienteActual);

        // APLICACIÓN DE DESCUENTOS EN MEMORIA (Para pruebas lógicas de POO)
        catalogo.get(0).aplicarDescuento(10); 

        // 4. MENÚ INTERACTIVO DE COMPRAS
        boolean continuarComprando = true;

        while (continuarComprando) {
            System.out.println("\n=================================================");
            System.out.println("       CATÁLOGO DISPONIBLE   ");
            System.out.println("=================================================");
            
            // Mostramos los productos aplicando Polimorfismo en ejecución
            for (int i = 0; i < catalogo.size(); i++) {
                System.out.print("[" + (i + 1) + "] ");
                catalogo.get(i).mostrarInformacion(); 
            }
            
            int opcionFacturar = catalogo.size() + 1;
            System.out.println("[" + opcionFacturar + "] >> FINALIZAR COMPRA Y GENERAR FACTURA <<");
            System.out.println("[0] Cancelar venta y salir");
            System.out.print("\nSeleccione una opción: ");

            int opcion = -1;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } else {
                System.out.println("¡Error! Ingrese un número entero válido.");
                scanner.nextLine(); 
                continue;
            }

            if (opcion > 0 && opcion <= catalogo.size()) {
                Producto productoSeleccionado = catalogo.get(opcion - 1);
                transaccion.agregarProducto(productoSeleccionado);
                System.out.println("-> ¡" + productoSeleccionado.getNombre() + " añadido al carrito!");
            } 
            else if (opcion == opcionFacturar) {
                transaccion.mostrarDetalleVenta();
                continuarComprando = false; 
            } 
            else if (opcion == 0) {
                System.out.println("\nCompra cancelada por el usuario.");
                continuarComprando = false;
            } 
            else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
        System.out.println("\n--- SISTEMA FINALIZADO DE FORMA CORRECTA ---");
    }
}