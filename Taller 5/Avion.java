public class Avion implements Volador {
    private String nombre;

    public Avion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela utilizando sus motores.");
    }
}