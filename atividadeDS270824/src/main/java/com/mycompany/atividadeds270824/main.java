/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeds270824;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        assistenteADM assistente = new assistenteADM("Mateus", 5897);
        Tecnico tecnico = new Tecnico("VP", 5421);

        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Matrícula: " + assistente.getMatricula());

        System.out.println("\nTécnico:");
        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("Matrícula: " + tecnico.getMatricula());
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.latir();
        cachorro.caminhar();

        gato.miar();
        gato.caminhar();
        
        Rico rico = new Rico(100000000);
        Pobre pobre = new Pobre(5000);
        Miseravel miseravel = new Miseravel(1000);
        
        System.out.println("\nO rico possui " + rico.getValor() + " em sua conta.");
        System.out.println("O pobre possui " + pobre.getValor() + " em sua conta.");
        System.out.println("O míseravel possui " + miseravel.getValor() + " em sua conta");
        
        Ingresso ingresso = new Ingresso();
        System.out.println("\nDigite 1 para normal e 2 para VIP:");
        int tipoIngresso = scanner.nextInt();
        if (tipoIngresso == 2) {
            ingresso.setVip(true);
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            int tipoCamarote = scanner.nextInt();
            ingresso.setCamaroteSuperior(tipoCamarote == 1);
        } else {
            ingresso.setVip(false);
        }
        
        System.out.println("Tipo do ingresso: " + ingresso.getTipo());
        System.out.println("Valor do ingresso: R$" + ingresso.getValor());
        
        System.out.println("\nDigite 1 para novo e 2 para velho:");
        int tipoImovel = scanner.nextInt();
        Imovel imovel = new Imovel(tipoImovel == 1);
        
        System.out.println("Valor final do imóvel: R$" + imovel.getValorFinal());
}
}