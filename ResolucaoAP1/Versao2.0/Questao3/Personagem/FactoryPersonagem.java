package Personagem;
import Arma.Arma;

public interface FactoryPersonagem {
    public IPersonagem fazIPersonagem(String tipo, String nome);
}
