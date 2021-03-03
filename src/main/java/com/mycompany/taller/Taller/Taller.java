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
public class Taller {
     private  Cola colaTotal;// para poner coches en cola 
     private Box[] boxes; 
      private GestorIO io;   
         
         public Taller(){
           colaTotal  = new Cola();
             boxes =new Box[5];
            io = new GestorIO();
         }
    public void estadoBox(){
      
    boxes[this.BoxElegido()-1].EstadoBox();// para mostrar el estado de box que nos piden 
      
}  public void estadoBoxes(){
      for(int i= 0; i<boxes.length ;i++){
    boxes[i].EstadoBox();// para mostrar el estado de todos los boxes;
}
    
      
}
    public int  BoxElegido(){
     int numeroBox;
    do{
        io.out("Dime el Box del cuál quieres saber el estado: (1-6)");
     numeroBox= io.inInt();
     if (numeroBox>=1 && numeroBox<=6){
         io.out("Introduce un número correcto ");
     }
    }while(numeroBox>=1 && numeroBox<=6);
    return numeroBox;
} 
public void altaVehiculo(){
    String tipo;
   do {
       io.out("Introduce el tipo de tu vehiculo");
       tipo=io.inString();
   }while(tipo.equalsIgnoreCase("Coche")!= true || tipo.equalsIgnoreCase("Microbus")!=true||  tipo.equalsIgnoreCase("Furgoneta")!=true || tipo.equalsIgnoreCase("Camión"));
   tipoVehiculo t2= new tipoVehiculo(tipo);
        io.out("Introduce la matricula de tu vehiculo");
        String matricula=io.inString();
     Vehiculo c1= new Vehiculo(t2,matricula); 
     colaTotal.ponerEncola(c1);
   
 
      
   }
public void reclamarVehiculoBox(){
                boolean vehiculoReclamado= false;
            for(int i=0; i<boxes.length;i++ ){
                if(boxes[i].hayLibre()== true){
                    boxes[i].ponerCocheBox(colaTotal.sacarVehiculo());
                   vehiculoReclamado= true;
                   break;  
                }
            }
            if(!vehiculoReclamado){
                io.out("No hay boxes libres para la recepción de coches.");
            } 
}
   
}    
    

