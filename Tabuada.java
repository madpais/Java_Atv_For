/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

import java.util.Scanner;

/**
 *
 * @author madpais
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero:");
        long n = ler.nextLong();
        System.out.println("Segue abaixo a tabuada do número " + n);
        for(int i=0;i<=10;i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
