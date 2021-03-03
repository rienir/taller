/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller.Taller;
import a72.util.GestorIO;
import com.mycompany.taller.Taller.enums.tipoVehiculo; 
/**
 *
 * @author ciclost
 */
public class Box {
   
   
    private  Vehiculo[] linea;// pues hay cuatro estados si se pasa es que ha pasado la revision 
    private GestorIO io;
    public Box(){
      this.linea  = new Vehiculo[3];
     io= new GestorIO();
}
  
      public boolean hayLibre(){
          boolean libre= false;
     
      
           if(linea[0]==null){
            libre= true;
       }
     return libre;
     }  
      public void ponerCocheBox(Vehiculo v1){
          if(this.hayLibre()){
              linea[0]=new Vehiculo (v1);
              io.out("El primer lugar en este box esta vacío");
          }
          else{io.out("El primer lugar en este box esta ocupado");
              
      }}
      public void aumentarFase(){
          
            for(int i=0; i<linea.length;i++){
                if(i==linea.length-1){
                    linea[i]=null;//pues esta en la última fila y no puede avanzar 
                }
                else if(linea[i]!=null){
                        
                      
           linea[i+1]=new Vehiculo(linea[i]);
           linea[i]= null;
           
             }
             
      }io.out("Los coches que hubiera han avanzado una posición ");
      }
public void EstadoBox(){
                for(int i=0; i<linea.length;i++){
                    if(linea[i]!=null){
                        io.out("La línea "+(i+1)+"esta  "+linea[i+1]);//debe imprimir el vehículo
                    }else io.out("La línea "+(i+1)+"esta vacía ");
                
                }

        
        
        }






}
