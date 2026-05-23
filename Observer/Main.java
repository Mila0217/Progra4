package Observer;

public class Main {
    public static void main(String[] args) {

        // Crear revista (Subject)
        Revista revista = new Revista();

        // Crear suscriptores (Observers)
        Suscriptor paula = new Suscriptor("Paula");
        Suscriptor julian = new Suscriptor("Julian");

        // Suscribir a la revista
        revista.suscribir(paula);
        revista.suscribir(julian);

        // Publicar noticia
        revista.publicarNoticia("Nueva edición: Patrón Observer explicado");

        // Desvincular a Julian
        revista.desvincular(julian);
        // Publicar otra noticia
        revista.publicarNoticia("Nueva edición: Patrones de diseño en Java");
    }
}