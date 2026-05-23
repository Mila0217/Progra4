/*
Ejercicio 2: Uso de Interfaces
Definir una interfaz llamada Volador que represente objetos que pueden volar.
La interfaz debe declarar el método:
volar()

Luego:
1. Crear dos clases que implementen la interfaz:
• Ave
• Avion
2. Cada clase debe implementar el método volar() mostrando un mensaje
diferente.
Ejemplo esperado:
• El ave vuela batiendo sus alas.
• El avión vuela utilizando sus motores.
Finalmente:
3. Crear un programa principal donde se creen objetos de estas clases y se
ejecute el método volar().
 */

public interface Volador {
    void volar();
}