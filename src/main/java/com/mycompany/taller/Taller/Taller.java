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
public class Taller {
     private  Cola colaTotal;// para poner coches en cola 
     private Box[] boxes; 
      private GestorIO io;   
      public Taller(){
           colaTotal  = new Cola();
             boxes =new Box[5];
             for(int i=0; i<boxes.length;i++){
                 boxes[i]= new Box();
             }
            io = new GestorIO();
         }

    public Cola getColaTotal() {
        return colaTotal;
    }

    public void setColaTotal(Cola colaTotal) {
        this.colaTotal = colaTotal;
    }

  

    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }
         
         
    public void estadoBox(int box ){
      
    boxes[box-1].EstadoBox();// para mostrar el estado de box que nos piden 
      
}  public void estadoBoxes(){
      for(int i= 0; i<boxes.length ;i++){
            System.out.print(" En el Box: "+(i+1));
          boxes[i].EstadoBox();// para mostrar el estado de todos los boxes;
}
     
    
      
}


 public void aumentarFaseEnBoxElegido(int box){
         boxes[box].aumentarFase();
 }
    public int  BoxElegido(){
     int numeroBox;
    do{
        io.out("Dime el Box del cuál quieres saber el estado: (1-6)");
             numeroBox= io.inInt();
     if (numeroBox>6 && numeroBox<1){
         io.out("Introduce un número correcto ");
     }
    }while(numeroBox>6 && numeroBox<1);
    return numeroBox;
} 
    
    
    
    
public void altaVehiculo(){
    
    final String PATRON="\\d{4}[A-Z]{3}";
      tipoVehiculo t2= null;
        Vehiculo c1=null;
       String tipo;
   do { io.out("Introduce el tipo de tu vehiculo\n");
       tipo=io.inString();
   }while(tipo.equalsIgnoreCase("coche")!= true || tipo.equalsIgnoreCase("camion")!=true||  tipo.equalsIgnoreCase("furgoneta")!=true || tipo.equalsIgnoreCase("microbus")!=true );
      
        t2.setTipo(tipo);
       do{
           io.out("Introduce la matricula de tu vehiculo\n");
            String matricula=io.inString();
        c1.setMatricula(matricula);
        c1.setTipo(t2);
        
       } while( !Pattern.matches(c1.getMatricula(), PATRON) && colaTotal.compararMatricula(c1, colaTotal.primerEspacioLibre()));
       
       
        colaTotal.ponerEncola(c1);
       //Comparar la matricula
       
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
    
       
       
         
           
      
  
           
       
        
        
       
       
       
       
 
      
   


