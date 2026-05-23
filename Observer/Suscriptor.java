package Observer;
// ConcreteObserver
public class Suscriptor implements Observador {

    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String noticia) {
        System.out.println(nombre + " recibió la noticia: " + noticia);
    }
}