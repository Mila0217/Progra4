package Taller1;

public class Main {
     public static void main(String[] args) {

        // RECTÁNGULO
        rectangulo r = new rectangulo();
        r.longitud = 5;
        r.ancho = 3;
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        // ESTUDIANTE
        Estudiante e = new Estudiante();
        e.nombre = "Ana";
        e.edad = 20;
        e.mostrarInformacion();

        // CUENTA BANCARIA
        Cuentabancaria c = new Cuentabancaria();
        c.numeroCuenta = "12345";
        c.saldo = 1000;
        c.depositar(500);
        System.out.println("Saldo: " + c.consultarSaldo());
        System.out.println("Numero de cuenta: " + c.numeroCuenta);

        // COCHE
        Coche coche = new Coche();
        coche.marca = "Toyota";
        coche.modelo = "Corolla";
        coche.año = 2022;
        coche.mostrarInformacion();

        // CALCULADORA
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(4, 6));
    }
}
