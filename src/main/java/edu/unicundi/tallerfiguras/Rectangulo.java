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
public class Rectangulo extends CuadradoRectangulo{
    
    private short lado2;

    public Rectangulo(short lado1, short lado2) {
        super(lado1);
        this.lado2=lado2;
    }
    
     public short getLado2() {
        return lado2;
    }

    public void setLado2(short lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public void hallarPerimetro(short lado1){
        perimetro= (short) (lado1*2 + lado2*2);
    }
   
    @Override
    public void hallarArea(short lado1){
        area= (short) (lado1*lado2);
    }
}
