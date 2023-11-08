import Arma.Arma;
import Arma.Espada;
import Personagem.IPersonagem;
import Personagem.Mago;

public class Main {
    public static void main(String[] args) {
        IPersonagem alucard = new Mago("Alucard");
        Arma a = new Espada("Escalibur", 10000000);
        System.out.println(alucard.atacar(a));
    }
}
