public class SacoMedio extends SacoDeBombom{
    String marca;
    public SacoMedio(String marca){
        super(marca);
    }
    public String leTipo(){
        return "Medio";
    }
    public  int leQuantidade(){
        return 25;
    }
    public String retornaMarca(){
        return "Marca";
    }
}
