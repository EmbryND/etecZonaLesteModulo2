package com.mycompany.corridadecarros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Samuel
 */
public class CarroEletrico extends Carro{
    private int capacidadeBateria;
    
    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, int capacidadeBateria){
    super(marca, modelo, ano, tipoDeCombustivel);
    this.capacidadeBateria = capacidadeBateria;    
    }
    
    public void carregarBateria() {
        System.out.println("O carro elétrico " +getModelo() + " está carregando a bateria.");
    }
    
    @Override
    public void acelerar() {
        System.out.println("O carro elétrico" + getModelo() + " está acelerando de forma silenciosa.");
    }
    
    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }
    
    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
}
