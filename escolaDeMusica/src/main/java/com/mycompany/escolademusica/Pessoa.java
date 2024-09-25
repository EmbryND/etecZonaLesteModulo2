package com.mycompany.escolademusica;

/**
 * Classe Abstrata Pessoa
 * Representa uma pessoa na escola de música.
 */
// Classe abstrata Pessoa
abstract class Pessoa {
    protected String nome;
    protected int idade;
    
   public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public abstract String atividade();
}