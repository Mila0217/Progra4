package Taller3;

public class libro extends recursos {
    private int disponibilidad;
//constructor           
    public libro(String titulo, String autor, String añodepublicacion, String editorial, int cantidad, int disponibilidad) {
        super(titulo, autor, añodepublicacion, editorial, cantidad);
        this.disponibilidad = getCantidad();
    }
//getters
    public int getDisponibilidad() {
        return disponibilidad;
    }
//setters
    public void setDisponibilidad(int disponibilidad) { 
        this.disponibilidad = disponibilidad;
    }       
//funcion para verificar si el libro esta disponible
    public boolean verificarDisponibilidad() {  
        return getDisponibilidad() > 0;
    }
//funcion para prestar el libro
    public void prestarLibro() {
        if (verificarDisponibilidad()) {
            disponibilidad--;
            System.out.println("Has prestado el libro: " + getTitulo());
        } else {
            System.out.println("Lo siento, el libro no está disponible.");
        }
    }    
//funcion para devolver el libro
    public void devolverLibro() {
        disponibilidad++;
        System.out.println("Has devuelto el libro: " + getTitulo());
    }
}
