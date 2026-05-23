package Taller1;

public class Cuentabancaria {
    String numeroCuenta;
    double saldo;

    void depositar(double monto) {
        saldo = saldo + monto;
    }

    void retirar(double monto) {
        saldo = saldo - monto;
    }

    double consultarSaldo() {
        return saldo;
    }
}
