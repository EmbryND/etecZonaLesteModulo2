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

public class MaiorNumero {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos os números são iguais");
        }
    }
}