/*
Ejercicio 3: Implementación de Interfaces y Polimorfismo
Crear una interfaz Notificacion con el método:
enviarNotificacion()
Luego crear las siguientes clases que implementen la interfaz:
• Email
• SMS
• NotificacionPush
Cada clase debe implementar el método mostrando un mensaje diferente.
Ejemplo:
• "Enviando notificación por Email"
• "Enviando notificación por SMS"
• "Enviando notificación Push"
Finalmente:
1. Crear un arreglo o lista de tipo Notificacion.

2. Guardar objetos de las diferentes clases.
3. Recorrer la lista e invocar el método enviarNotificacion().

*/

public interface Notificacion {
    void enviarNotificacion();
}