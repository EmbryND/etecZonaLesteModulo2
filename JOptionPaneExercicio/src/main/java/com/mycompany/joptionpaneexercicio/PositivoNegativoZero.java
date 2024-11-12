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

public class PositivoNegativoZero {
    public static void main (String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é positivo.");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero.");
        }
    }
}