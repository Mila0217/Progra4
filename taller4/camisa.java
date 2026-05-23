package taller4;

public class camisa extends base {
    private String tipoDeManga;
//constructor
    public camisa(int precio, String talla, String material, String tipoDeManga) {
        super(precio, talla, material);
        this.tipoDeManga = tipoDeManga;
    }
//getter
    public String getTipoDeManga() {
        return tipoDeManga;
    }   
//setter
    public void setTipoDeManga(String tipoDeManga) {
        this.tipoDeManga = tipoDeManga;
    }   
//metodo para mostrar la informacion de la camisa
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Manga: " + tipoDeManga);
    }
//metodo para calcular el precio con descuento para las camisas
    @Override
    public double calcularPrecioConDescuento(double descuento) {
         descuento = 10;// Descuento del 10% para las camisas 
        double precioConDescuento = super.calcularPrecioConDescuento(descuento);
        return precioConDescuento;
    } 
}
