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
}
