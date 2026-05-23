package Taller1;

public class rectangulo {
    // ATRIBUTOS
    double longitud;
    double ancho;

    // MÉTODO para calcular área
    double calcularArea() {
        return longitud * ancho;
    }

    // MÉTODO para calcular perímetro
    double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}
