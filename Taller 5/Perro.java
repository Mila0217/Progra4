public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    public void mostrarNombre() {
        System.out.println("El perro se llama: " + getNombre());
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    @Override
    public void mover() {
        System.out.println(getNombre() + " está corriendo.");
    }
}