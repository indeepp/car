/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ual.pp.poo;

public class Jeep extends Carro {

   
    public void ligarTracao4x4() {
         
            System.out.println("Tração ligada!");
    }
    
    public void desligarTracao4x4(){
            System.out.println("Tração Desligada");
      
    }
                

               
    
     @Override
    public void buzinar() {
        super.buzinar();
        
        System.out.println("buzina Jeep");
    }
    public String ToString(){
        return " Isto é um Jeep";
}
}