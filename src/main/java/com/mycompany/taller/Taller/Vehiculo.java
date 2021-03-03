/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller.Taller;
import a72.util.GestorIO;
import com.mycompany.taller.Taller.enums.tipoVehiculo;
import java.util.regex.Pattern;

/**
 *
 * @author ciclost
*/

 
public class Vehiculo {// hacer una comprobación para que la matrícula no se repite 
        private tipoVehiculo tipo;
        private String matricula;
        private static  final String PATRON="\\d{4}[A-Z]{3}";
         private GestorIO io= new GestorIO();
        
         
    public Vehiculo(tipoVehiculo tipo, String matricula) {
        assert  Pattern.matches(matricula, PATRON);
       
       this.matricula= matricula;
       this.tipo = tipo;
      
    }
    

    public tipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(tipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Vehiculo(Vehiculo vehiculo){
        this.matricula= vehiculo.matricula;
        this.tipo=vehiculo.tipo;
    }
    public String toString(){
        return("El vehiculo que tiene la matricula"+this.matricula+"y es de tipo"+this.tipo);
        
        
}
    
}