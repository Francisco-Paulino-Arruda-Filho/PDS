package Personagem;

import Arma.Arma;

public class Paladino implements IPersonagem{
    private String tipo;
    private String nome;
    public Paladino(String nome){
        this.nome = nome;
        this.tipo = "Paladino";
    }
    public int atacar(Arma arma){
        return arma.causarDano();
    }
}
