package org.example.Ej1;

public class Cuenta {
    public static int siguienteNumeroCuenta=1;
    private int numeroCuenta;
    private String nombre;
    private float saldo;

    public Cuenta(String nombre){
        this.numeroCuenta=siguienteNumeroCuenta++;
        this.nombre=nombre;
        saldo=0;
    }
    public Cuenta(String nombre, float saldo){
        this.numeroCuenta=siguienteNumeroCuenta++;
        this.nombre=nombre;
        this.saldo=saldo;
    }
    public boolean ingreso(float cantidad) {
        if (cantidad > 0){
            saldo += cantidad;
            return true;
        } else return false;
    }
    public boolean reintegro(float cantidad) {
        if (cantidad > saldo)
            return false;
        saldo-=cantidad;
        return true;
    }

    public boolean transferencia(Cuenta destino, float cantidad){
        if (reintegro(cantidad))
            return destino.ingreso(cantidad);
        return false;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getNombre(){
        return nombre;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }



    @Override
    public String toString(){
        return "Cuenta numero: " + numeroCuenta + "\nTitular: " + nombre + "\nSaldo: " + saldo + "€\n";
    }
}
