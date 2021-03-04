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
         private static GestorIO io= new GestorIO();
         private String modelo;
         private String marca;
        
         
    public Vehiculo(tipoVehiculo tipo, String matricula) {
        assert  Pattern.matches(matricula, PATRON);
       
       this.matricula= matricula;
       this.tipo = tipo;
       this.modelo=null;
      this.marca=null;
    }
    public Vehiculo(tipoVehiculo tipo, String matricula,String modelo) {
        assert  Pattern.matches(matricula, PATRON);
       
       this.matricula= matricula;
       this.tipo = tipo;
       this.modelo=modelo;
      this.marca=null;
    }
      public Vehiculo(tipoVehiculo tipo, String matricula,String modelo, String marca) {
        assert  Pattern.matches(matricula, PATRON);
       
       this.matricula= matricula;
       this.tipo = tipo;
       this.modelo=modelo;
      this.marca=marca;
    }
     
        
       
          
     
          
      

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        String aux;
        if(this.marca.equalsIgnoreCase("null")){
        aux= "El vehiculo que tiene la matricula "+this.matricula+", es de tipo"+this.tipo+ "y el modelo es"+this.modelo;
        }
        else if(this.modelo.equalsIgnoreCase("null")){
        aux="El vehiculo que tiene la matricula "+this.matricula+", es de tipo"+this.tipo;
        }
        else{
        aux="El vehiculo que tiene la matricula "+this.matricula+" , es de tipo"+this.tipo+", el modelo es: "+this.modelo+"y la marca es:"+this.marca;
        }
        return aux;
    }
    
    
}