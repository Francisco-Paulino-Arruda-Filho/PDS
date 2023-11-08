public class SacoGrande extends SacoDeBombom{
    String marca;
    public SacoGrande(String marca){
        super(marca);
    }
    public String leTipo(){
        return "Grande";
    }
    public  int leQuantidade(){
        return 50;
    }
    public String retornaMarca(){
        return "Marca";
    }
}
