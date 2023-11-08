import java.util.ArrayList;

public abstract class SacoDeBombom implements Identificador, IBombom  {
    String marca;
    private ArrayList<IBombom> bombons;
    public SacoDeBombom(String marca){
        this.marca = marca;
        bombons = new ArrayList<IBombom>();
    }
    public abstract String leTipo();
    public abstract int leQuantidade();
    public abstract String retornaMarca();
}