package com.mycompany.corridadecarros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo{
    private String tipoDeCombustivel;
    
    public Carro(String modelo, String marca, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    @Override
    public void acelerar(){
        System.out.println("O carro " + getModelo() + " está acelerando com " + tipoDeCombustivel +".");
    }
    
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }
    
    public void setTipoDeCombustivel(String tipoDeCombustivel){
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
}
