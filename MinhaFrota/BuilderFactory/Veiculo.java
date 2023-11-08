package BuilderFactory;

public abstract class Veiculo extends Rodas implements Identificador{
	String chassi;
	public Veiculo(String chassi){
		this.chassi = chassi;
	}
	public abstract Integer getNumeroRodas();
	public abstract String getTipoVeiculo();
}
