
public abstract class IngredienteAbstrato implements ISanduiche{
	float custo;
	ISanduiche sanduiche;
	
	public IngredienteAbstrato(ISanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	
	
	public float lePreco() {
		return custo + sanduiche.lePreco();
	}

}
