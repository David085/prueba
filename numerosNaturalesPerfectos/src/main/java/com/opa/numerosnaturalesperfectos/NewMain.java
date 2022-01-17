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
            for (int i = min; i <= max; i++) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        contador += j;
                    }
                }
                if (contador == i) {
                    System.out.println(i);
                }
                contador = 0;
            } // fin for
        } catch (Exception e) {
            System.out.println("Error");
        } // fin try-catch

    } // fin esPerfecto

    public static void main(String[] args) {
        esPerfecto();
    } // fin main

} // fin clase
