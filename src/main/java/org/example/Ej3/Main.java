package org.example.Ej3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contador[] contadors=new Contador[4];
        for (int i=0; i<contadors.length; i++){
            contadors[i]=new Contador();
        }
        contadors[0].incrementar();
        contadors[3].incrementar();
        System.out.println(Arrays.toString(contadors));
    }
}
