/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionactivity;

/**
 *
 * @author Admin
 */
public class Usuario {
    private String nome;
    private String email;
    
    public Usuario(String nome, String email) throws NomeInvalidoException, EmailInvalidoException {
        validarNome(nome);
        validarEmail(email);
        this.nome = nome;
        this.email = email;
    }
    
    private void validarNome(String nome) throws NomeInvalidoException {
        if (nome.length() < 3) {
            throw new NomeInvalidoException("Erro: O nome deve ter pelo menos 3 caracteres.");
        }
    }
    
    private void validarEmail(String email) throws EmailInvalidoException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidoException("Erro: E-mail inválido. Deve conter '@' e um domínio");
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
}
