/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Admin
 */
class Funcionario extends Pessoa implements Identificavel{
    private String numeroCracha;
    
    public Funcionario(String nome, int idade, String numeroCracha) {
        super(nome, idade);
        this.numeroCracha = numeroCracha;
    }
    
    @Override
    public String atividade() {
        return "Realizar tarefas administrativas.";
    }
    
    @Override 
    public String getId() {
        return numeroCracha;
    }
}