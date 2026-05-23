package Taller3;

public class recursos {
    private String titulo;
    private String autor;
    private String editorial;
    private String añodepublicacion;
    private int cantidad;
//constructor
    public recursos(String titulo, String autor, String añodepublicacion, String editorial, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.añodepublicacion = añodepublicacion;
        this.editorial = editorial;
        this.cantidad = cantidad;
    }
//getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAño_de_publicacion() {
        return añodepublicacion;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getCantidad() {
        return cantidad;
    }


//setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño_de_publicacion(String añodepublicacion) {
        this.añodepublicacion = añodepublicacion;
    }   
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    } 
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
