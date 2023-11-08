public class carro extends Veiculo{
    String tipo;
    int numRodas;
    carro(String chassi){
        super(chassi);
        numRodas = getNumeroRodas();
        tipo = getTipoVeiculo();
    }
    @Override
    public int getNumeroRodas(){
        return 4;
    }
    @Override
	public String getTipoVeiculo(){
        return "carro";
    }
}
