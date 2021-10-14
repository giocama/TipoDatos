package com.generation;

public class Main {

    public static void main(String[] args) {
        //Variable String
	    String nombre = "Giovanni Calleja";

	    //Datos primitivos numerico
	    byte num1 = 10;
	    short num2 = 10;
	    int num3 = 10;
	    long num4 = 10;

	    //Datos primitivos decimales
	    float decimal1 = 10.4454554218f;
	    double decimal2 = 10.6565464654d;

	    //Datos primitivos char
        char caracter = 'f';

        //Dato primitivo Boolean
        boolean verdadero = true;

        // Convertir variables
        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;

        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short) (numByte1 + numByte2);

        byte numero1 = 5;
        byte numero2 = 5;

        byte sumas = (byte) (numero1 + numero2);
        byte resta = (byte) (numero1 - numero2);
        byte multiplicacion = (byte) (numero1 * numero2);
        byte division = (byte) (numero1 / numero2);

        //Operadores aritmeticos
        //+ sumar o concatenar cadenas
        // - restar
        // * multiplicar
        // / dividir
        // % residuo

//	      System.out.println(nombre);
//	      System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);
//        System.out.println(decimal1);
//        System.out.println(decimal2);
//        System.out.println(numInt);
//        System.out.println(suma);

        System.out.println(sumas);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }
}
