import Arma.*;
import Personagem.*;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Arma arma = builder.fazArma("espada", "excalibur", 1000000);
        IPersonagem personagem = builder.fazIPersonagem("Guerreiro", "Leon");
        System.out.println(personagem.atacar(arma));
    }
}
