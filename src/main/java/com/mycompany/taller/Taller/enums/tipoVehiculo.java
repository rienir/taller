/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller.Taller.enums;

/**
 *
 * @author ciclost
 */
public enum tipoVehiculo {
     coche("Coche"), microbus("Microbus"), furgoneta("Furgoneta"),camion("Camión"); 

        private String tipo;
        
        private tipoVehiculo(String tipo){
             this.tipo = tipo;
        }
       
         
}
