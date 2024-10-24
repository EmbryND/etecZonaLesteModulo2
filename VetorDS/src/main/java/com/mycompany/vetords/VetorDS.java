/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetords;

/**
 *
 * @author Samuel
 */
import java.util.Scanner;
public class VetorDS {

    public static void main(String[] args) {
        int numeros = 10;
        int[] numerosos = new int[numeros];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            numerosos[i] = scanner.nextInt();
        }
        
        System.out.print("Os números inseridos são:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + numerosos[i]);
        }
        
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma+= numerosos[i];
        }
        
        System.out.println("A soma de todos os números é: " + soma);
        
        int maior = numerosos[0];
        int menor = numerosos[0];
        
        for (int i = 0; i < 10; i++) {
            if (numerosos[i] > maior) {
                maior = numerosos[i];
            }
            if (numerosos[i] < menor){
                menor = numerosos[i];
            }
        }
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        scanner.close();
    }
}