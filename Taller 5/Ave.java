public class Ave implements Volador {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela batiendo sus alas.");
    }
}