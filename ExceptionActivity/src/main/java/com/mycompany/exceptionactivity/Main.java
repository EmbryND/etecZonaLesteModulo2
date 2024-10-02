/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionactivity;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Tentando cadastrar usuário com nome curto...");
            Usuario usuario1 = new Usuario("Jo", "joao@email.com");
        } catch (NomeInvalidoException | EmailInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("Tentando cadastrar usuário com e-mail inválido...");
            Usuario usuario2 = new Usuario("Maria", "mariaemail.com");
        } catch (NomeInvalidoException | EmailInvalidoException e){
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("Tentando cadastrar usuário válido...");
            Usuario usuario3 = new Usuario("Carlos", "carlos@email.com");
            System.out.println("Usuário cadastrado com sucesso: " + usuario3.getNome() + ", " + usuario3.getEmail());
        } catch (NomeInvalidoException | EmailInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
