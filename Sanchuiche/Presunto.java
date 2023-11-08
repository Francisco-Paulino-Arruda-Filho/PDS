public class Presunto extends IngredienteAbstrato{
    public Presunto(ISanduiche sanduiche){
        super(sanduiche);
        this.custo = 0.5;
    }
    public double lePreco(){
        return custo + sanduiche.lePreco();
    }
}
