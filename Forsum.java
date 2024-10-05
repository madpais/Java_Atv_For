/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forsum;

/**
 *
 * @author madpais
 * Crie um programa em Java que some os números de 1 a 50 e imprima o resultado.
 */
public class Forsum {

    public static void main(String[] args) {
        int x = 0;
        for (int i=1; i<=50; i++) {
            System.out.println(i + " + " + x + " = " + (x+i));
            x=x+i;
        }
    }
}