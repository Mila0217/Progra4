public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
    public void mostrarNombre() {
        System.out.println("El gato se llama: " + getNombre());
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    @Override
    public void mover() {
        System.out.println(getNombre() + " está saltando.");
    }
}