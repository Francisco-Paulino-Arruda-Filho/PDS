public class moto extends Veiculo{
    String tipo;
    int numRodas;
    moto(String chassi){
        super(chassi);
        numRodas = getNumeroRodas();
        tipo = getTipoVeiculo();
    }
    @Override
    public int getNumeroRodas(){
        return 2;
    }
    @Override
	public String getTipoVeiculo(){
        return "moto";
    }
}
