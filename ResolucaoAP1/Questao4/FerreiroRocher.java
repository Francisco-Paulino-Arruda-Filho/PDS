public class FerreiroRocher extends Bombom{
    private double preco;
    public FerreiroRocher(){
        this.preco = getPreco();
    }
    public String retornaTipo(){
        return "Ferreiro Rocher";
    }
    public double getPreco(){
        return 4.0;
    }
}
