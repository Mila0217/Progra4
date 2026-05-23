public class Coche extends Vehiculo {
    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println("El coche se mueve usando un motor.");
    }
}
