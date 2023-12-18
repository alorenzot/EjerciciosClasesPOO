package org.example.Ej2;

import org.example.Ej1.Cuenta;

public class TarjetaDeCredito {
    private static int siguienteNumero=1;
    private final int LIMITE;
    private Cuenta cuentaAsociada;
    private float saldoCredito;
    private int numeroTarjeta;

    public TarjetaDeCredito(int limite, Cuenta cuenta){
        this.LIMITE=limite;
        this.cuentaAsociada=cuenta;
        numeroTarjeta=siguienteNumero++;
        saldoCredito=LIMITE;
    }
    public TarjetaDeCredito(Cuenta cuenta){
        this(3000,cuenta);
    }
    public boolean pagarCredito(float cantidad){
        if (cantidad<=0) return false;
        if (saldoCredito>=cantidad){
            saldoCredito-=cantidad;
            return true;
        } else return false;
    }
    public boolean pagarDebito(float cantidad){
        return cuentaAsociada.reintegro(cantidad);
    }
    public void reiniciarCredito(){
        if (!cuentaAsociada.reintegro(LIMITE-saldoCredito)){
            float nuevoSaldo=cuentaAsociada.getSaldo()-(LIMITE-saldoCredito);
            cuentaAsociada.setSaldo(nuevoSaldo);
        } else {
            saldoCredito=LIMITE;
        }
    }
    public float getSaldoCredito(){
        return saldoCredito;
    }
    public int getNumeroTarjeta(){
        return numeroTarjeta;
    }
    public Cuenta getCuentaAsociada(){
        return cuentaAsociada;
    }
    public int getLimite(){
        return LIMITE;
    }

    @Override
    public String toString(){
        return "Numero Tarjeta: " + numeroTarjeta + "\n" +
                "Saldo Disponible Crédito: " + saldoCredito + "\n" +
                cuentaAsociada;
    }
}
