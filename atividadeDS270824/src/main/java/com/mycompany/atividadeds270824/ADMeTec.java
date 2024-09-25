package com.mycompany.atividadeds270824;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */
import java.util.Scanner;

class assistenteADM {
    private String nome;
    private int matricula;
    
    public assistenteADM(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
}

class Tecnico {
    private String nome;
    private int matricula;
    
    public Tecnico(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
}