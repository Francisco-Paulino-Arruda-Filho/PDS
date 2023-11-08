package Personagem;
import Arma.Arma;

public interface FactoryPersonagem {
    public IPersonagem fazIPersonagem(String nome, Arma arma);
}
