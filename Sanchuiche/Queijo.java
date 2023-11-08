public class Queijo extends IngredienteAbstrato{
    public Queijo(ISanduiche sanduiche){
        super(sanduiche);
        this.custo = 0.5;
    }
    public double lePreco(){
        return custo + sanduiche.lePreco();
    }
}
