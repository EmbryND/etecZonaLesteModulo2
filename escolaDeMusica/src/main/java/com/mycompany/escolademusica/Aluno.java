/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Admin
 */
class Aluno extends Pessoa implements Identificavel {
    private String matricula;
    
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    
    @Override
    public String atividade() {
        return "Frequentar aulas e praticar instrumentos.";
    }
    
    @Override
    public String getId() {
        return matricula;
    }
}