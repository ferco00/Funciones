/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author Luis Fernando
 */
public class Funciones {

    public static void main(String[] args){
        int n1, n2, producto;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        n1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número: ");
        n2 = teclado.nextInt();

        producto = multiplicar(n1, n2);

        System.out.printf("La multiplicación es: %d", producto);
    }

    private static int multiplicar(int x, int y)
    {
        return x * y;
    }
}
