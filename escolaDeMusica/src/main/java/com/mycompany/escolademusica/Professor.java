/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Admin
 */
class Professor extends Pessoa implements Identificavel{
    private String registroFuncional;
    
    public Professor(String nome, int idade, String registroFuncional) {
        super(nome, idade);
        this.registroFuncional = registroFuncional;
    }
    
    @Override
    public String atividade() {
        return "Ministrar aulas de música.";
    }
    
    @Override
    public String getId() {
        return registroFuncional;
    }
}