package taller4;

public class pantalon extends base {
    private String tipoDePantalon;
//constructor
    public pantalon(int precio, String talla, String material, String tipoDePantalon) {
        super(precio, talla, material);
        this.tipoDePantalon = tipoDePantalon;
    }
//getter
    public String getTipoDePantalon() {
        return tipoDePantalon;
    }       
//setter
    public void setTipoDePantalon(String tipoDePantalon) {
        this.tipoDePantalon = tipoDePantalon;
    }
//metodo para mostrar la informacion del pantalon
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Pantalon: " + tipoDePantalon);
    }
//metodo para calcular el precio con descuento para los pantalones
    @Override
    public double calcularPrecioConDescuento(double descuento) {
         descuento = 15;// Descuento del 15% para los pantalones 
        double precioConDescuento = super.calcularPrecioConDescuento(descuento);
        return precioConDescuento;
    }
    
}
