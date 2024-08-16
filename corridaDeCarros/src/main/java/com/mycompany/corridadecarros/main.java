package com.mycompany.corridadecarros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Punto", 2018);
        Carro carro = new Carro("Chevrolet", "Onix", 2020, "gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, "elétrico", 100);
        
        veiculo.acelerar();
        veiculo.freiar();
        
        carro.acelerar();
        carro.freiar();
        
        carroEletrico.acelerar();
        carroEletrico.freiar();
        carroEletrico.carregarBateria();
    }
}
