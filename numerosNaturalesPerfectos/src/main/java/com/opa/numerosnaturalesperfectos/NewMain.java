package com.opa.numerosnaturalesperfectos;

import java.util.Scanner;

public class NewMain {

    public static void esPerfecto() {
        try {
            int min, max, contador = 0; //min y max son los valores extremos del rango de números
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba el valor menor del intervalo: ");
            min = sc.nextInt();
            System.out.println("Escriba el valor mayor del intervalo: ");
            max = sc.nextInt();
            for (int i = min; i <= max; i++) { //Con este for se recorre el rango dado
                for (int divisor = 1; divisor < i; divisor++) { //Con este for sabemos si el numero actual es perfecto
                    if (i % divisor == 0) {
                        contador += divisor; // se van acumulando los divisores en la variable contador
                    }
                }
                if (contador == i) { // contador = suma de los divisores. i = el numero que estamos evaluando
                    System.out.println(i);
                }
                contador = 0;
            } // fin for
        } catch (Exception e) {
            System.out.println("Error");
        } // fin try-catch

    } // fin esPerfecto

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("- Programa para listar números perfectos -");
        System.out.println("------------------------------------------\n");
        System.out.println("""
                           Debe ingresar dos valores que corresponden
                           al intervalo en el cual desea buscar núfameros perfectos.
                           Tenga en cuenta que deben ser núfameros naturales
                           """);
        esPerfecto();
    } // fin main

} // fin clase
