package org.example.Ej1;

import org.example.Ej2.TarjetaDeCredito;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Manolo", 1000);
        TarjetaDeCredito t1 = new TarjetaDeCredito(3000,c1);
        System.out.println(t1);
    }
}
