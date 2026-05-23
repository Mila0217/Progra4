public class Pez extends Animal implements Nadador {
    public Pez(String nombre) {
        super(nombre);
    }

    public void mostrarNombre() {
        System.out.println("El pez se llama: " + getNombre());
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez no hace sonido audible");
    }

    @Override
    public void mover() {
        System.out.println("El pez nada en el agua");
    }

    @Override
    public void nadar() {
        System.out.println("El pez está nadando");
    }
}