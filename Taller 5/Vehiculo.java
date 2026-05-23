

/*
Ejercicio 1: Creación de Clases y Métodos Abstractos
Definir una clase abstracta Vehiculo que represente diferentes medios de
transporte.
La clase debe tener:
• Un atributo nombre
• Un método concreto mostrarNombre()
• Un método abstracto mover()
Luego:
1. Crear las clases derivadas:
o Coche
o Bicicleta
2. Cada clase debe implementar el método mover() mostrando un mensaje
diferente.
Ejemplo esperado:
• El coche se mueve usando un motor.
• La bicicleta se mueve pedaleando.
Finalmente:
3. Crear una clase Main donde se creen objetos de Coche y Bicicleta y se
invoquen sus métodos.

*/

public abstract class Vehiculo {
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public abstract void mover();
}
