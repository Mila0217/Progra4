package Taller3;

public class revista extends recursos {
    private int disponibilidad;
//constructor
    public revista(String titulo, String autor, String añodepublicacion, String editorial, int cantidad, int disponibilidad) {
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

//funcion para prestar la revista
    public void prestarrevista() {
    
        if (verificarDisponibilidad()) {
            disponibilidad--;
            System.out.println("Has prestado la revista: " + getTitulo());
        } else {
            System.out.println("Lo siento, la revista no está disponible.");
        }
    }   
//funcion para devolver la revista
    public void devolverrevista() {
        disponibilidad++;
        System.out.println("Has devuelto la revista: " + getTitulo());
    }    
}
