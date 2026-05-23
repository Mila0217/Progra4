package Taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Listas para cada tipo
        ArrayList<libro> libros = new ArrayList<>();
        ArrayList<revista> revistas = new ArrayList<>();
        ArrayList<pelicula> peliculas = new ArrayList<>();

        // Datos de prueba
        libros.add(new libro("Cadaver exquisito", "A.bazterrica", "2017", "Penguin random house", 3, 3));
        revistas.add(new revista("National Geographic", "Autor2", "2020", "NG", 2, 2));
        peliculas.add(new pelicula("Paprika", "Satoshi Kon", "2006", "Madhouse", 1, 1));

        int opcion;

        do {
            System.out.println("\n------ MENÚ ------");
            System.out.println("1. Prestar recurso");
            System.out.println("2. Devolver recurso");
            System.out.println("3. Mostrar recursos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el título: ");
                    String tituloPrestar = sc.nextLine();
                    // Validar entrada
                    if (tituloPrestar == null || tituloPrestar.trim().isEmpty()) {
                        System.out.println("Título inválido.");
                        break;
                    }

                    boolean encontrado = false;

                    // Buscar en libros
                    for (libro l : libros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloPrestar)) {
                            encontrado = true;
                            if (l.verificarDisponibilidad()) {
                                l.prestarLibro();
                            } else {
                                System.out.println("Libro no disponible.");
                            }
                        }
                    }

                    // Buscar en revistas
                    for (revista r : revistas) {
                        if (r.getTitulo().equalsIgnoreCase(tituloPrestar)) {
                            encontrado = true;
                            if (r.verificarDisponibilidad()) {
                                r.prestarrevista();
                            } else {
                                System.out.println("Revista no disponible.");
                            }
                        }
                    }

                    // Buscar en películas
                    for (pelicula p : peliculas) {
                        if (p.getTitulo().equalsIgnoreCase(tituloPrestar)) {
                            encontrado = true;
                            if (p.verificarDisponibilidad()) {
                                p.prestarPelicula();
                            } else {
                                System.out.println("Película no disponible.");
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Recurso no encontrado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el título: ");
                    String tituloDevolver = sc.nextLine();

                    if (tituloDevolver == null || tituloDevolver.trim().isEmpty()) {
                        System.out.println("Título inválido.");
                        break;
                    }

                    boolean encontradoDev = false;

                    for (libro l : libros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                            l.devolverLibro();
                            encontradoDev = true;
                        }
                    }

                    for (revista r : revistas) {
                        if (r.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                            r.devolverrevista();
                            encontradoDev = true;
                        }
                    }

                    for (pelicula p : peliculas) {
                        if (p.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                            p.devolverPelicula();
                            encontradoDev = true;
                        }
                    }

                    if (!encontradoDev) {
                        System.out.println("Recurso no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nLIBROS:");
                    for (libro l : libros) {
                        System.out.println(l.getTitulo() + " - Disponibles: " + l.getDisponibilidad());
                    }

                    System.out.println("\nREVISTAS:");
                    for (revista r : revistas) {
                        System.out.println(r.getTitulo() + " - Disponibles: " + r.getDisponibilidad());
                    }

                    System.out.println("\nPELÍCULAS:");
                    for (pelicula p : peliculas) {
                        System.out.println(p.getTitulo() + " - Disponibles: " + p.getDisponibilidad());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}