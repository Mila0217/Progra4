package taller4;

public class abrigo extends base {
    private String tipoDeAbrigo;
//constructor
    public abrigo(int precio, String talla, String material, String tipoDeAbrigo) {
        super(precio, talla, material);
        this.tipoDeAbrigo = tipoDeAbrigo;
    }       
//getter
    public String getTipoDeAbrigo() {   
        return tipoDeAbrigo;
    }
//setter
    public void setTipoDeAbrigo(String tipoDeAbrigo) {
        this.tipoDeAbrigo = tipoDeAbrigo;
    }
//metodo para mostrar la informacion del abrigo
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Abrigo: " + tipoDeAbrigo);
    }
//metodo para calcular el precio con descuento para los abrigos
    @Override
    public double calcularPrecioConDescuento(double descuento) {
         descuento = 20;// Descuento del 20% para los abrigos 
        double precioConDescuento = super.calcularPrecioConDescuento(descuento);
        return precioConDescuento;
    }
}
