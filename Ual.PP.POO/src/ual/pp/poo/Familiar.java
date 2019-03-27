/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ual.pp.poo;

public class Familiar extends Carro {

    public void ligarACManual() {

        System.out.println("AC ligado!");
        
    }
 @Override
    public void buzinar() {
        //super.buzinar();
        System.out.println("buzina Familiar");
    }
}
