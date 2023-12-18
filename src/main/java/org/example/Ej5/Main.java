package org.example.Ej5;

public class Main {
    public static void main(String[] args) {
        Fraccion f = new Fraccion(2,4);
        Fraccion f2 = new Fraccion(2,4);
        System.out.println(f + " * " + f2 + " = " + f.multiplicar(f2));

        Fraccion resultado=f2.multiplicar(new Fraccion(5,6));
        System.out.println(f2 + " * 5/6 = " + resultado);
        Fraccion suma = f.sumar(f2);
        System.out.println(suma);
    }

}
