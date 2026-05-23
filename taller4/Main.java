package taller4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear una lista para almacenar los productos
        ArrayList<base> productos = new ArrayList<>();

        // Crear algunos productos 
        productos.add(new camisa(50, "M", "Algodón", "Manga Corta"));
        productos.add(new pantalon(70, "L", "Denim", "Jeans"));
        productos.add(new abrigo(120, "XL", "Lana", "Abrigo Largo"));


       int opcion;
        do {
            System.out.println("\n------ MENÚ ------");
            System.out.println("1. Mostrar productos"); 
            System.out.println("2. Calcular precio con descuento");
            System.out.println("3. Salir"); 
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt(); 
            switch (opcion) {
                case 1:
                    for (base producto : productos) {
                        producto.mostrarInformacion();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el índice del producto (0-" + (productos.size() - 1) + "): ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < productos.size()) {
                        base productoSeleccionado = productos.get(indice);
                        double precioConDescuento = productoSeleccionado.calcularPrecioConDescuento(0); // El descuento se define en cada clase
                        System.out.println("Precio con descuento: $" + precioConDescuento);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
            }while (opcion != 3);
                scanner.close();
}
}
