public class OuroBranco extends Bombom implements Tipo{
    private double preco;
    public OuroBranco(){
        this.preco = getPreco();
    }
    public String retornaTipo(){
        return "Ouro Branco";
    }
    public double getPreco(){
        return 3.50;
    }
}
