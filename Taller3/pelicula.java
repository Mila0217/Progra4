package Taller3;

public class pelicula extends recursos {
    private int disponibilidad;
    private String director;
    private String productora;
//constructor
    public pelicula(String titulo, String director, String añodepublicacion, String productora, int cantidad, int disponibilidad) {
        super(titulo,director, añodepublicacion, productora, cantidad);
        this.disponibilidad = getCantidad();
        this.director = director;
        this.productora = productora;
    }
//getters
    public int getDisponibilidad() {
        return disponibilidad;
    }
    public String getDirector() {
        return director;
    }       
    public String getProductora() {
        return productora;
    }
//setters
    public void setDisponibilidad(int disponibilidad) { 
        this.disponibilidad = disponibilidad;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setProductora(String productora) {
        this.productora = productora;
    }
//funcion para verificar si la pelicula esta disponible
    public boolean verificarDisponibilidad() {  
        return getDisponibilidad() > 0;
    }
//funcion para prestar la pelicula
    public void prestarPelicula() {
        if (verificarDisponibilidad()) {
            disponibilidad--;
            System.out.println("Has prestado la película: " + getTitulo());
        } else {
            System.out.println("Lo siento, la película no está disponible.");
        }
    }
//funcion para devolver la pelicula
    public void devolverPelicula() {
        disponibilidad++;
        System.out.println("Has devuelto la película: " + getTitulo());
    }
    
}
