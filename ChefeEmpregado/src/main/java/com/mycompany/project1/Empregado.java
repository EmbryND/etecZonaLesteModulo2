/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Admin
 */
public abstract class Empregado {
    private String nome;
    private String familia;
    
    public Empregado(String n, String f) {
        nome = n;
        familia = f;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getFamilia() {
        return familia;
    }
    
    public String toString() {
        return nome + " " + familia;
    }
    
    public abstract double ganhar();
}
