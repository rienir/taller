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
public class Menu {
     private Taller t1;
     private GestorIO io; 
   public Menu(){
     t1 =new Taller();
     io= new GestorIO();
}
  public void Mostrar(){
       int eleccion;
       do{
           io.out("1.Alta y recepción de vehículos \n 2.Reclamar vehículo para entrar en box\n 3.Mover todos los vehículos de fase dentro de un box.\n 4.Información del estado de un box concreto\n  5.Información general de todos los boxes\n  6.Salir del programa.\n");
      
           eleccion=io.inInt();
            
       if(eleccion==1){
           t1.altaVehiculo();
       }
       else if(eleccion==2){
           t1.reclamarVehiculoBox();
       }
       else if(eleccion==3){
       int box= t1.BoxElegido();
       t1.aumentarFaseEnBoxElegido(box);
           box=0;
       }
       else if(eleccion==4){
            int box= t1.BoxElegido();
           t1.estadoBox(box);
           box=0;
       }
       else if(eleccion==5){
          t1.estadoBoxes();
                  
          
       }
       else if(eleccion==6){
           io.out("El programa ha acabado");
       }
       else{
           io.out("Numero no Valido\n");
       }
       
       }while(eleccion>=1 && eleccion<=5 );// pues si pone 6 el programa se acaba 
      
       
       
       
       
       
       
       
   }

}

