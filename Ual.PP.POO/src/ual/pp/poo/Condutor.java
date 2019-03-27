/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ual.pp.poo;

public class Condutor {
    //Atributos

    private String nome;
    private int idade;
    private int destreza;

    public Condutor() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getDestreza() {
        return this.destreza;
    }
}
