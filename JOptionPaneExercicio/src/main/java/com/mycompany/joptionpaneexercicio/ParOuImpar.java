/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joptionpaneexercicio;

/**
 *
 * @author Samuel
 */
import javax.swing.*;

public class ParOuImpar {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar.");
        }
    }
}