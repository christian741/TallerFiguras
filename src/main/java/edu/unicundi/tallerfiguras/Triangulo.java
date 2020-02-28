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

    public short hallarArea(short lado1,short lado2,short lado3){
        short area= (short) (lado1*lado2/2);
        setPerimetro(area);
        return area;   
    }
    
    public byte verificarTriangulo(short lado1,short lado2,short lado3){
        //1= equilatero 2 = isoceles 3=escaleno
        byte tipo=0;
        
        if(lado1== lado2 && lado1==lado3 && lado2==lado3){
            tipo =1;
        }else{
            if(lado1==lado2 || lado1==3 && lado2==lado3){
                tipo = 2;
            }else{
                tipo=3;
            }
        }
        
        
        return tipo;
    }
 
   
    public short  hallarPerimetro(short lado1 , short lado2 , short lado3){
        short perimetro= (short) (lado1+lado2+lado3);
        setPerimetro(perimetro);
        return perimetro;    
    }
  
    
    
}
