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

public class MediaAprovacao {
    public static void main (String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
    
        double media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 6) {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nAprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nReprovado.");
        }
    }
}