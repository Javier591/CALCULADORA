/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Stateless;

@Stateless
public class CaldBean implements CaldBeanLocal {

    @Override
    public Double sumar(double valor1, double valor2) {
        return (valor1 + valor2);
    }

    @Override
    public Double restar(double valor1, double valor2) {
        return  (valor1 - valor2);
    }

    @Override
    public Double multi(double valor1, double valor2) {
        return  (valor1 * valor2);
    }

    @Override
    public Double divi(double valor1, double valor2) {
        return  (valor1 / valor2);
    }

   
   

   

   
    
}
