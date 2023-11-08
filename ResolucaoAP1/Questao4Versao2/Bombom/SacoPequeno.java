public class SacoPequeno extends SacoDeBombom{
    String marca;
    public SacoPequeno(String marca){
        super(marca);
    }
    public String leTipo(){
        return "Pequeno";
    }
    public  int leQuantidade(){
        return 10;
    }
    public String retornaMarca(){
        return "Marca";
    }
}
