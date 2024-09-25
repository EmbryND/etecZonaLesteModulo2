/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeds270824;

/**
 *
 * @author Admin
 */
public class Ingresso {
    private boolean vip;
    private boolean camaroteSuperior;
    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    public void setCamaroteSuperior(boolean camaroteSuperior) {
        this.camaroteSuperior = camaroteSuperior;
    }
    
    public String getTipo() {
        if (vip) {
            return camaroteSuperior ? "Camarote Superior VIP" : "Camarote Inferior VIP";
        } else {
            return "Normal";
        }
    }
    
    public double getValor() {
        if (vip) {
            return camaroteSuperior ? 200.0 : 150;
        } else {
            return 50.0;
        }
    }
}
