/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadrado;

import java.util.Scanner;

/**
 *
 * @author madpais
 */
public class Quadrado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        long n = ler.nextLong();
        for(int i=1;i<=n;i++) {
            System.out.println(i + " ao quadrado eh: " + i*i);
        }
        
    }
}
