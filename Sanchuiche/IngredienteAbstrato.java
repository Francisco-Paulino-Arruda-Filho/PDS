//Guarda objeto do mesmo tipo dele
public abstract class IngredienteAbstrato implements ISanduiche {
    private double custo;
    ISanduiche sanduiche;
    public IngredienteAbstrato(ISanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    public double lePreco(){
        return custo + sanduiche.lePreco();
    }
}
