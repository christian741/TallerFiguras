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
   
     /**
     * metodo que calcula el perimetro del rectangulo
     *
     * @param lado1
     * @param lado2
     */
    @Override
    public void hallarPerimetro(short lado1, short lado2) {
        short perimetro = (short) (lado1 * 2 + lado2 * 2);
        setPerimetro(perimetro);
    }

    /**
     * metodo que calcula el area del rectangulo
     *
     * @param lado1
     * @param lado2
     */
    @Override
    public void hallarArea(short lado1, short lado2) {
        short area = (short) (lado1 * lado2);
        setArea(area);
    }
    
     public boolean verificarRectangulo(int lado1,int lado2,int lado3 ,int lado4){
         
         boolean validacion = false;
         byte acumulador = 0;
         if (lado1 == lado2);
         acumulador++;
         if (lado1 == lado3) {
             acumulador++;
         }
         if (lado1 == lado4) {
             acumulador++;
         }
         if (lado2 == lado3) {
             acumulador++;
         }
         if (lado2 == lado4) {
             acumulador++;
         }
         if(lado3==lado4){
             acumulador++;
         }
         if(acumulador==2){
             validacion=true;
         }

        return validacion;
    }
}
