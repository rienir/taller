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
public class TallerITV {
     private Menu menu;
   
    public TallerITV(){
        
    menu= new Menu();
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TallerITV revision = new TallerITV();
     revision.menu.Mostrar();
    }
    
}
