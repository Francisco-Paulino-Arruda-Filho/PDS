package BuilderFactory;

public class Moto extends Veiculo{
    String tipo;
    Integer rodas;
	public Moto(String chassi){
		super(chassi);
        this.rodas = getNumeroRodas();
        this.tipo = getTipoVeiculo();
	}
	public Integer getNumeroRodas(){
        return 2;
    }
	public String getTipoVeiculo(){
        return "Moto";
    }
}
