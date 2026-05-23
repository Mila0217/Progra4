package sistemamakeup;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE VENTAS DE MAQUILLAJE ---\n");

        // 1. Crear el cliente
        Cliente cliente1 = new Cliente("Camila Restrepo", "camila@correo.com");

        // 2. Instanciar productos usando Polimorfismo (tipo base Producto)
        Producto baseMatte = new ProductoRostro("R01", "Base Liquida Matte", 30.0, "Maybelline", "Grasa");
        Producto corrector = new ProductoRostro("R02", "Corrector Fit Me", 15.0, "Maybelline", "Mixta");
        Producto rimel = new ProductoOjos("O01", "Pestañina Sky High", 18.0, "L'Oréal", true);
        Producto paletaSombras = new ProductoOjos("O02", "Paleta Nude", 45.0, "Urban Decay", false);

        // 3. Probar la interfaz Descontable (Aplicar descuentos antes de la venta)
        System.out.println("--- Aplicando promociones del mes ---");
        baseMatte.aplicarDescuento(10); // 10% de descuento sobre el precio base
        paletaSombras.aplicarDescuento(20); // 20% de descuento sobre el precio base
        System.out.println();

        // 4. Crear la transacción de venta
        Venta transaccion = new Venta(5001, cliente1);

        // 5. Agregar registros al sistema (Requerimiento 6)
        transaccion.agregarProducto(baseMatte);
        transaccion.agregarProducto(corrector);
        transaccion.agregarProducto(rimel);
        transaccion.agregarProducto(paletaSombras);

        // 6. Mostrar el informe completo y el cálculo matemático
        transaccion.mostrarDetalleVenta();
    }
}