public abstract class Veiculo implements Rodas, identificador{
	String chassi;
	public Veiculo(String chassi){
		this.chassi = chassi;
	}
	public abstract int getNumeroRodas();
	public abstract String getTipoVeiculo();
}
