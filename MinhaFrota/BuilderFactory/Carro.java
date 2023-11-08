package BuilderFactory;

public class Carro extends Veiculo{
    String chassi;
    String tipo;
    Integer rodas;
	public Carro(String chassi){
		super(chassi);
        this.rodas = getNumeroRodas();
        this.tipo = getTipoVeiculo();
	}
	public Integer getNumeroRodas(){
        return 4;
    }
	public String getTipoVeiculo(){
        return "Carro";
    }
}
