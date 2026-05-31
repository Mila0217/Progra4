package sistemamakeup;

import java.util.ArrayList;
import java.util.List;

public class TiendaMaquillaje {
    // Lista de observadores (clientes) suscritos
    private List<Observer> observadores = new ArrayList<>();
    private String nombreTienda;

    public TiendaMaquillaje(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    // Métodos para suscribir o desuscribir observadores
    public void suscribir(Observer observador) {
        observadores.add(observador);
    }

    public void desuscribir(Observer observador) {
        observadores.remove(observador);
    }

    // El método del Sujeto que dispara la magia del patrón Observer
    public void notificarDescuentosMes(String detallesDescuento) {
        System.out.println("\n>>> [SISTEMA OBSERVER] DISPARANDO NOTIFICACIONES MASIVAS <<<");
        System.out.println("Tienda: " + nombreTienda);
        System.out.println("Promoción: " + detallesDescuento + "\n");

        for (Observer ob : observadores) {
            ob.actualizar(detallesDescuento); // Polimorfismo en ejecución puro
        }
    }
}