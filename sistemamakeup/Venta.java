package sistemamakeup;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int numeroFactura;
    private Cliente cliente;
    private List<Producto> listaProductos; // Colección para almacenar registros

    public Venta(int numeroFactura, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
    }

    // Operación: Permitir agregar registros
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("-> Producto '" + producto.getNombre() + "' añadido a la venta.");
    }

    // Operación lógica: Calcular total de la venta aplicando Polimorfismo en ejecución
    public double calcularTotalVenta() {
        double total = 0;
        for (Producto prod : listaProductos) {
            // Llama dinámicamente a calcularPrecioFinal() de ProductoRostro o ProductoOjos
            total += prod.calcularPrecioFinal(); 
        }
        return total;
    }

    // Operación: Mostrar información detallada
    public void mostrarDetalleVenta() {
        System.out.println("\n=======================================================");
        System.out.println("               FACTURA DE VENTA N°: " + numeroFactura);
        System.out.println("=======================================================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Email:   " + cliente.getEmail());
        System.out.println("-------------------------------------------------------");
        System.out.println("PRODUCTOS ADQUIRIDOS:");
        
        // Polimorfismo en ejecución al invocar mostrarInformacion()
        for (Producto prod : listaProductos) {
            prod.mostrarInformacion();
        }
        
        System.out.println("-------------------------------------------------------");
        System.out.printf("TOTAL NETO A PAGAR: $%.2f\n", calcularTotalVenta());
        System.out.println("=======================================================\n");
    }

    // Getters y Setters
    public int getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(int numeroFactura) { this.numeroFactura = numeroFactura; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
