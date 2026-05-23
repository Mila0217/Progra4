package taller4;

public class base {
    private int precio;
    private String talla;
    private String material;
//constructor
    public base(int precio, String talla, String material) {
        this.precio = precio;
        this.talla = talla;
        this.material = material;
    }
//getters
    public int getPrecio() {
        return precio;
    }       
    public String getTalla() {
        return talla;
    }
    public String getMaterial() {
        return material;
    }
//setters
    public void setPrecio(int precio) {
        this.precio = precio;
    }       
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

//metodo para mostrar la informacion del producto
    public void mostrarInformacion() {
        System.out.println("Precio: " + precio);
        System.out.println("Talla: " + talla);
        System.out.println("Material: " + material);
    }
//metodo para calcular el precio con descuento
    public double calcularPrecioConDescuento(double descuento) {
        return precio - (precio * descuento / 100);
    }
    
}
