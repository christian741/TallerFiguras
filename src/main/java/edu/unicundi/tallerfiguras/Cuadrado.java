/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tallerfiguras;

/**
 *
 * @author perfil1
 */
public class Cuadrado extends CuadradoRectangulo{
     /**
     * metodo que calcula el perimetro  del cuadrado
     * @param lado1 
     */
   
    @Override
    public void hallarPerimetro(short lado1,short lado2){
        short perimetro = (short) (lado1*2 + lado2*2);
        setPerimetro(perimetro);
        System.out.println("El perimetro del cuadrado es:"+getPerimetro());
    }
    
    /**
     * metodo que calcula el area del cuadrado
     * @param lado1 
     */
   
    @Override
    public void hallarArea(short lado1,short lado2){
        short area= (short) (lado1*lado2);
        setArea(area);
        System.out.println("El area del cuadrado es:"+getArea());
    }
    
     public boolean verificarCuadrado(int lado1,int lado2,int lado3 ,int lado4){
        boolean validacion=false;
        if(lado1==lado2 && lado1==lado3 && lado1 == lado4 && lado2==lado3 && lado2==lado4 && lado3== lado4){
            validacion=true;
        }
        return validacion;
    }
    
}
