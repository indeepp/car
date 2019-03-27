package ual.pp.poo;

public class TestaBuzinar1 {

    public static void main(String[] args) {

        Citadino carro1 = new Citadino();
        Jeep carro2 = new Jeep();
        Familiar carro3 = new Familiar();

        carro1.buzinar();
        carro2.buzinar();
        carro3.buzinar();
        carro1.desligarAirbagPassageiro();
        carro2.desligarTracao4x4();
        carro2.ligado=false;
        
       
      

    }

}
