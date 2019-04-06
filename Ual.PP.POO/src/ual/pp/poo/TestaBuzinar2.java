/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ual.pp.poo;
import  java.util.Scanner;


public class TestaBuzinar2 {
     public static void main(String args[]) {
   
         
         
         
    
    
        Citadino carro1 = new Citadino();
        Jeep carro2 = new Jeep();
        Familiar carro3 = new Familiar();
        Carro carros =new Carro() {};

        carro1.buzinar();
        carro2.buzinar();
        carro3.buzinar();
        carro1.desligarAirbagPassageiro();
        carro2.desligarTracao4x4();
        carro2.ligado=false;
        carros.buzinar();
        carros.desligar();
        carros.ligar();
   
    
//    ///////////////////////////
        
        Scanner s = new Scanner(System.in);
         System.out.println("Insira o tipo de carro");
         String tipoCarro = s.nextLine();
         
    Carro carro;
        
    
    if (tipoCarro.equals("Citadino")) {
             carro= new Citadino();
    }
    else if (tipoCarro.equals("Jeep")) {
            carro= new Familiar();
        }
    else if (tipoCarro.equals("Familiar")){
            carro = new Familiar();
        }
    else    {
        carro = new Carro() {};
        System.out.println("O tipo de carro que inseriu não existe");
    }
    
    /////////////////////////
    carro.buzinar();
    
         if (carro instanceof Citadino) {
             ((Citadino)carro).desligarAirbagPassageiro();
             
         }
         else if (carro instanceof Jeep) {
             ((Jeep)carro).desligarTracao4x4();
         }
         
         else if(carro instanceof Familiar) {
             ((Familiar)carro).ligarACManual();
         }
    
    
  }

}
    
     
