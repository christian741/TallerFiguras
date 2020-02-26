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
public class Triangulo extends Figura{
    
    private short base;
    
    private short altura;

    public short getBase() {
        return base;
    }

    public void setBase(short base) {
        this.base = base;
    }

    public short getAltura() {
        return altura;
    }

    public void setAltura(short altura) {
        this.altura = altura;
    }
    
    
    //no importa sus lados
    @Override
    public short hallarArea(){
        area= (short) ((base* altura)/2);
        return this.area;
    }
    
    //solo si es equilatero
    @Override
    public short hallarPerimetro(){
        perimetro= (short) (base*3);
        return perimetro;    
    }
    /*@Override
    //isoceles
    public short hallarPerimetro(){
        perimetro= (short) (lado1 *lado2 + base);
        return perimetro;    
    }
    //escaleno
    @Override
    public short hallarPerimetro(){
        perimetro= (short)lado1+lado2+lado3;
        return perimetro;    
    }*/
    
    
}
