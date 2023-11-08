import java.util.ArrayList;

public class Compra {
    private ArrayList<SacoDeBombom> sacosDeBombons;
    SacoDeBombom sacoBombom;
    public Compra() {
        sacosDeBombons = new ArrayList< SacoDeBombom >();
    }
    public int contaQuantidadeBombons () {
        int bombons = 0;
        bombons += sacoBombom.retornaTamanho();
        return bombons;
    }
}