/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayds;

/**
 *
 * @author Samuel
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDS {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Maçã");
        fruits.add("Uva");
        fruits.add("Laranja");
        fruits.add("Pêra");
        fruits.add("Mexerica");

        System.out.println("Frutas antes de ordenar: " + fruits);

        Collections.sort(fruits);

        System.out.println("Frutas depois de ordenar: " + fruits);

        fruits.remove(3);
        System.out.println("Frutas depois de remover: " + fruits);

        String frutaProcurada = "Laranja";
        boolean encontrada = fruits.contains(frutaProcurada);

        if (encontrada) {
            System.out.println(frutaProcurada + " está na lista.");
        } else {
            System.out.println(frutaProcurada + " não está na lista.");
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(30);
        numbers.add(1);
        numbers.add(20);

        System.out.println("Números antes de ordenar: " + numbers);

        Collections.sort(numbers);

        System.out.println("Números depois de ordenar: " + numbers);

        int countPares = contarPares(numbers);
        System.out.println("Quantidade de números pares: " + countPares);
    }

    public static int contarPares(ArrayList<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}