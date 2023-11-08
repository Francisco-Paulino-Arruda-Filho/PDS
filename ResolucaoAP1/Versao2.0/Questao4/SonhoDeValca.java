public class SonhoDeValca extends Bombom implements Tipo{
    private double preco;
    public SonhoDeValca(){
        this.preco = getPreco();
    }
    public String retornaTipo(){
        return "Sonho de Valça";
    }
    public double getPreco(){
        return 2.50;
    }
}
