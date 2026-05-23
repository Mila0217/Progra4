public class Bicicleta extends Vehiculo { 
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta se mueve pedaleando.");
    }
}
