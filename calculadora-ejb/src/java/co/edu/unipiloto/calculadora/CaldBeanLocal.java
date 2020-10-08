/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Local;

/**
 *
 * @author CITIUS-PRESTAMO
 */
@Local
public interface CaldBeanLocal {

    Double sumar(double valor1, double valor2);

    Double restar(double valor1, double valor2);

    Double multi(double valor1, double valor2);

    Double divi(double valor1, double valor2);


    

       
}
