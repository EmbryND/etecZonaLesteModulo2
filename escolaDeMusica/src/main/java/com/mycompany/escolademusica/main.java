/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Aluno("Gustavo", 22, "12345"));
        pessoas.add(new Professor("Wagner", 53, "11274"));
        pessoas.add(new Funcionario("Mateus C.", 23, "87203"));
        
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Idade: " + pessoa.idade);
            System.out.println("Atividade: " + pessoa.atividade());
            System.out.println("Identificador: " + ((Identificavel) pessoa).getId());
        }
    }
}