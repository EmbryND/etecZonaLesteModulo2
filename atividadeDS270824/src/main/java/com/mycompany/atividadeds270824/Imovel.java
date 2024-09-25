/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeds270824;

/**
 *
 * @author Samuel
 */
public class Imovel {
    private boolean novo;
    
    public Imovel(boolean novo) {
        this.novo = novo;
    }
    
    public double getValorFinal() {
        return novo ? 250000.0 : 125000.0;
    }
}
