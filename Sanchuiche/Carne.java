public class Carne extends IngredienteAbstrato{
    public Carne(ISanduiche sanduiche){
        super(sanduiche);
        this.custo = 1.5;
    }
    public double lePreco(){
        return custo + sanduiche.lePreco();
    }
}
