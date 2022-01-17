package com.opa.numerosnaturalesperfectos;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        int min, max, contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        min = sc.nextInt();
        System.out.println("ingrese un numero");
        max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    contador += j;
                }
            }
            if (contador==i) {
                System.out.println(i);
            }
            contador = 0;
        }

    } // fin main

} // fin clase
