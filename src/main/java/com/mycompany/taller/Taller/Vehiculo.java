/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller.Taller;
import com.mycompany.taller.Taller.enums.tipoVehiculo;
/**
 *
 * @author ciclost
*/

 
public class Vehiculo {
        private tipoVehiculo tipo;
        private String matricula;
        
         
    public Vehiculo(tipoVehiculo tipo, String matricula) {
        assert matricula.length()==7;// para que sean 4 números y tres letras
       this.matricula= matricula;
       this.tipo = tipo;
    }
    public Vehiculo(Vehiculo vehiculo){
        this.matricula= vehiculo.matricula;
        this.tipo=vehiculo.tipo;
    }
    
}