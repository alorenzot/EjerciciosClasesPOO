package org.example.Ej5;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion multiplicar(Fraccion f) {
        return simplificar(new Fraccion(numerador * f.numerador, denominador * f.denominador));
    }

    public Fraccion multiplicar(int numero) {
        return multiplicar(new Fraccion(numero, 1));
    }

    public Fraccion dividir(Fraccion f) {
        return simplificar(new Fraccion(numerador * f.denominador, denominador * f.numerador));
    }

    public Fraccion dividir(int numero) {
        return dividir(new Fraccion(numero, 1));
    }

    public Fraccion sumar(Fraccion f) {
        return simplificar(new Fraccion(numerador * f.denominador + denominador * f.numerador, denominador * f.denominador));
    }

    public Fraccion sumar(int numero) {
        return sumar(new Fraccion(numero, 1));
    }

    public Fraccion restar(Fraccion f) {
        return simplificar(new Fraccion(numerador * f.denominador - denominador * f.numerador, denominador * f.denominador));
    }

    public Fraccion restar(int numero) {
        return restar(new Fraccion(numero, 1));
    }

    public static Fraccion simplificar(Fraccion f) {
        int mcd = maximoComunDivisor(f.numerador, f.denominador);
        return new Fraccion(f.numerador / mcd, f.denominador / mcd);
    }

    public void simplificar() {
        int mcd = maximoComunDivisor(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    private static int maximoComunDivisor(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
