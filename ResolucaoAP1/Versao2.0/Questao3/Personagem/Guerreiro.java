package Personagem;

import Arma.Arma;

public class Guerreiro implements IPersonagem{
    private String tipo;
    private String nome;
    public Guerreiro(String nome){
        this.nome = nome;
        this.tipo = "Guerreiro";
    }
    public int atacar(Arma arma){
        return arma.causarDano();
    }
}