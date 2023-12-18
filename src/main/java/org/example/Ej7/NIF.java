package org.example.Ej7;

public class NIF {
    private int numero;
    private char letra;
    private final static char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NIF(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(letras, numero);
    }

    public static char calcularLetra(char[] array, int numbers) {
        //Este método consigue la letra de tu DNI.
        int letter = numbers % 23;
        char result = array[letter];
        return result;
    }
    public int getNumero(){
        return numero;
    }
    public char getLetra(){
        return letra;
    }

    @Override
    public String toString() {
        return "La letra del DNI " + numero + " es " + letra + "\n";
    }
}
