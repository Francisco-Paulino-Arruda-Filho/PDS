package Personagem;

import Arma.Arma;

public class Mago implements IPersonagem{
    private String tipo;
    private String nome;
    public Mago(String nome){
        this.nome = nome;
        this.tipo = "Mago";
    }
    public int atacar(Arma arma){
        return arma.causarDano();
    }
}