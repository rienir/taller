/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller.Taller;

/**
 *
 * @author ciclost
 */
public class Cola {
     private static Vehiculo[] cola= new Vehiculo[14];// puede haber 15 en cola
    public Cola(){

}
public void ponerEncola(Vehiculo vehiculo){
   
    for(int i=0; i<cola.length;i++){
        if(cola[i]==null){
            cola[i]= new Vehiculo(vehiculo);
                break;// para ponerlo en cola  y salir 
                
        }
    }
}
public void sacarVehiculo(Vehiculo vehiculo){
    if(cola[0]==vehiculo){
            cola[0]= null;// para ponerlo en cola 
            Cola.reorganizar();
    }
    else System.out.println("Error");//mostrar fallo pq no hay vehiculos 
}
public static void reorganizar(){// poner todos 
  for(int i=0; i<cola.length;i++)
      if(cola[i]!=null){//cuando hay vehiculos 
 cola[i-1]=cola[i]; // para poner todos los vehiculos en una posición menos 
      }
      
  
}




}
