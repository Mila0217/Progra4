public class Main {
    // Crear objetos de Coche y Bicicleta
    public static void main(String[] args) {     
        Vehiculo coche1 = new Coche("Toyota");
        Vehiculo bicicleta1 = new Bicicleta("Mountain Bike");

        // Mostrar nombres y movimientos
        coche1.mostrarNombre();
        coche1.mover();

        bicicleta1.mostrarNombre();
        bicicleta1.mover();

        // Crear objetos de Ave y Avion
        Volador ave1 = new Ave("Águila");
        Volador avion1 = new Avion("Boeing 747");
        // Ejecutar método volar
        ave1.volar();
        avion1.volar();

        // Crear objetos de Email, SMS y NotificacionPush
        Notificacion email = new Email();
        Notificacion sms = new SMS();
        Notificacion push = new NotificacionPush();
        // Crear una lista de Notificacion y agregar los objetos
        Notificacion[] notificaciones = {email, sms, push};
        // Recorrer la lista e invocar el método enviarNotificacion()
        for (Notificacion notificacion : notificaciones) {
            notificacion.enviarNotificacion();
        }

        Pez pez1 = new Pez("Nemo");
        pez1.mostrarNombre();
        pez1.nadar();
        pez1.hacerSonido();
        pez1.mover();

        Gato gato1 = new Gato("Whiskers");
        gato1.mostrarNombre();
        gato1.hacerSonido();
        gato1.mover();

        Perro perro1 = new Perro("Rex");
        perro1.mostrarNombre();
        perro1.hacerSonido();
        perro1.mover();
        

    }
}
