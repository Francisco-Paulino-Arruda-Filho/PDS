import Arma.Arma;
import Arma.FactoryArma;
import Arma.Cajado;
import Personagem.FactoryPersonagem;
import Personagem.Guerreiro;
import Personagem.IPersonagem;
import Personagem.Mago;
import Arma.Espada;
import Arma.Anel;
import Personagem.Paladino;

public class Builder implements FactoryArma, FactoryPersonagem{
    public Arma fazArma(String tipo, String nome, int preco){
        if(tipo.equals("Anel")){
            return new Anel(nome, preco);
        }else if(tipo.equals("Espada")){
            return new Espada(nome, preco);
        }else{
            return new Cajado(nome, preco);
        }
    }
    public IPersonagem fazIPersonagem(String tipo, String nome){
        if(tipo.equals("Mago")){
            return new Mago(nome);
        }else if(tipo.equals("Paladino")){
            return new Paladino(nome);
        }else{
            return new Guerreiro(nome);
        }
    }
}
