/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tallerfiguras;

/**
 *
 * @author Christian Diaz
 * @author Cristian Medina
 */
public class CuadradoRectangulo extends Figura{

    private short lado1;
    
    public CuadradoRectangulo(short lado1){
        this.lado1=lado1;
    }
    
    public short getLado1() {
        return lado1;
    }

    public void setLado1(short lado1) {
        this.lado1 = lado1;
    }
    public void hallarPerimetro(short lado1){
        perimetro= (short) (lado1*4);
    }
    
    public void hallarArea(short lado1){
        area= (short) (lado1^2);
    }
    
}
