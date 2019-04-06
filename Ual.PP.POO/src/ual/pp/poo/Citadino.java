package ual.pp.poo;

public class Citadino extends Carro {

    public void desligarAirbagPassageiro() {

        System.out.println("Airbag desligado!");

    }

    @Override
    public void buzinar() {
        super.buzinar();
        System.out.println("buzina Citadino");
    }
    public String ToString(){
        return " Isto é um Citadino";
    }
    
}
