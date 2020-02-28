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
    
    private short lado3;

    public void hallarArea(short lado1,short lado2,short lado3){
       
    }
 
   
    public short  hallarPerimetro(short lado1 , short lado2 , short lado3){
        short perimetro= (short) (lado1+lado2+lado3);
        return perimetro;    
    }
  
    
    
}
