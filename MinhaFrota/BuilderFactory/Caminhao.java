package BuilderFactory;

public class Caminhao extends Veiculo{
    String tipo;
    Integer rodas;
	public Caminhao(String chassi){
		super(chassi);
        this.rodas = getNumeroRodas();
        this.tipo = getTipoVeiculo();
	}
	public Integer getNumeroRodas(){
        return 6;
    }
	public String getTipoVeiculo(){
        return "Caminhao";
    }
}
