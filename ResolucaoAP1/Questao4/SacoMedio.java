import java.util.ArrayList;

public class SacoMedio {
    private String marca;
    private ArrayList<Bombom> bomboms;
    public SacoMedio(){
        bomboms = new ArrayList<Bombom>(25);
    }
    public int retornaTamanho(){
        return 25;
    }
}
