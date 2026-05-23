package Observer;
import java.util.ArrayList;
import java.util.List;

// Subject
public class Revista {

    // Lista de suscriptores
    private List<Observador> observadores = new ArrayList<>();

    // Suscribir observador
    public void suscribir(Observador observador) {
        observadores.add(observador);
    }

    // Eliminar observador
    public void desvincular(Observador observador) {
        observadores.remove(observador);
    }

    // Notificar a todos
    public void notificar(String noticia) {
        for (Observador o : observadores) {
            o.actualizar(noticia);
        }
    }

    // Nueva edición publicada
    public void publicarNoticia(String noticia) {
        System.out.println("\nRevista publicada: " + noticia);
        notificar(noticia);
    }
}