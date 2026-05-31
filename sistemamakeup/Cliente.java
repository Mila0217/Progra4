package sistemamakeup;

public class Cliente implements Observer {
    private int id; // Añadimos el ID de la base de datos
    private String nombre;
    private String email;

    // Constructor completo
    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Constructor antiguo (por si lo usas en otras partes sin ID de BD)
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    // IMPLEMENTACIÓN DEL PATRÓN OBSERVER
    @Override
    public void actualizar(String mensajeNotificacion) {
        System.out.println("  [NOTIFICACIÓN ENVIADA A: " + email + "]");
        System.out.println("  ¡Hola " + nombre + "! " + mensajeNotificacion);
        System.out.println("-------------------------------------------------");
    }
}