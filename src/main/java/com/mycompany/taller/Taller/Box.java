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
public class Box {
   
   
    private  Vehiculo[] linea;// pues hay cuatro estados si se pasa es que ha pasado la revision 
    private Mecanico mec;
    public Box(){
      this.linea  = new Vehiculo[3];
      this.mec= new Mecanico();
}
  public int primeraLineaLibre(){
  if(this.hayLibre()){
      for(int i=0; i<linea.length;i++){
           if(linea[i]==null)   return i;
  }
  }  return -1;
  
  }
      public boolean hayLibre(){
          boolean libre= false;
     
      for(int i=0; i<linea.length;i++){
           if(linea[i]==null){
            libre= true;
      } }
     return libre;
     }  
      public void aumentarFase(){
            for(int i=linea.length-1; i>0;i--){
           linea[i]=linea[i++];
           
  }
      }






}
