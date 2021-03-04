/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller.Taller;

import a72.util.GestorIO;

/**
 *
 * @author ciclost
 */
public class Cola {
     private Vehiculo[] cola;// puede haber 15 en cola
private GestorIO io;
    public Cola(){
         cola=new Vehiculo[14];
        io= new GestorIO();
}
public void ponerEncola(Vehiculo vehiculo){
   
    for(int i=0; i<cola.length;i++){
        if(cola[i]==null){
            cola[i]= new Vehiculo(vehiculo);
            io.out("Se ha introducido el coche en la posicion de la cola "+(i+1));//+1 pq i empieza de zero
                break;// para ponerlo en cola  y salir 
                
        }
        
    }
}
public boolean compararMatricula(Vehiculo c1, int espacioLibre){
    boolean matriculaUnica= true;
     for(int i=0; i<espacioLibre;i++){
         if(cola[i].getMatricula().equalsIgnoreCase(c1.getMatricula())){
             matriculaUnica=false;
         }
     }
    return matriculaUnica;
}

public int primerEspacioLibre(){
    int espacioLibre=-1;
     for(int i=0; i<cola.length;i++){
        if(cola[i]==null){
           espacioLibre= i;
           break;
        } }
     return espacioLibre;

}
public Vehiculo sacarVehiculo(){
    if(cola[0]!=null){
        Vehiculo aux= new Vehiculo(cola[0]);
            cola[0]= null;// para ponerlo en cola 
           this.reorganizar();
            io.out("Se ha sacado el vehículo y se ha reorganizado la cola");
            return aux;
    }
    else io.out("Error no hay vehículos en la cola ");
                    return null;//mostrar fallo pq no hay vehiculos 
}
public  void reorganizar(){// poner todos 
  for(int i=0; i<this.cola.length;i++)
      if(cola[i]!=null){//cuando hay vehiculos 
 cola[i-1]=new Vehiculo(cola[i]);
     cola[i]=null; // para poner todos los vehiculos en una posición menos 
      }
      
  
}




}
