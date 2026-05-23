package Taller2;

public class Calculadora {
    //atributos encapsulados
    private double a;
    private double b;
    private double resultado;

    //constructor
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
        this.resultado = 0;
    }   

    //métodos de acceso (getters y setters)
    //get
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //set
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    //metodo para multiplicar
    public double multiplicar() {
        resultado = 0;
        int contador = 0;
        if (a == 0 || b == 0) {
            resultado = 0;

        } else if (a > 0 && b > 0) {
             while (contador < b) {
            resultado += a;
            contador++;
        }
        } else if (a < 0 && b < 0) {
            while (contador < -b) {
            resultado += a;
            contador++;
        }
        } else if (a > 0 && b < 0) {
            while (contador < -b) {
            resultado -= a;
            contador++;
        }
        } else if (a < 0 && b > 0) {
            while (contador < b) {
            resultado -= a;
            contador++;
        }
    }
        return resultado;
    }


    //metodo para dividir
       public double dividir() {
    resultado = 0;

    if (b == 0 ) {
        System.out.println("No se puede dividir por cero");
        return 0;
    } else if (a == 0) {
        return 0;
    } else if (a > 0 && b > 0) {
    double tempA = a;
    while (tempA >= b) {
        tempA = tempA - b;
        resultado++;
    }
    }
    return resultado;
    }

       }
    
