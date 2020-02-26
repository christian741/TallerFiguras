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
public class Figura {
    
    
    short area;
    short perimetro;
    
    

    public short getArea() {
        return area;
    }

    public void setArea(short area) {
        this.area = area;
    }

    public short getPerimetro() {
        return perimetro;
    }

    public short setPerimetro(short perimetro) {
        return perimetro;
    }
    
    public short hallarArea(){
        return area;
        
    }
    public short hallarPerimetro(){
        return perimetro;
        
    }
    
    
    
    
}
