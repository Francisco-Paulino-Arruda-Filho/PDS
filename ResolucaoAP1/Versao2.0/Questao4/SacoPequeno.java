import java.util.ArrayList;

public class SacoPequeno extends SacoDeBombom{
    private ArrayList<Bombom> bomboms;
    public SacoPequeno(){
        bomboms = new ArrayList<Bombom>(10);
    }
    public int retornaTamanho(){
        return 10;
    }
}
