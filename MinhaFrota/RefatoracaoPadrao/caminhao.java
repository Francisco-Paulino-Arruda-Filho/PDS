public class caminhao extends Veiculo{
    String tipo;
    int numRodas;
    caminhao(String chassi){
        super(chassi);
        numRodas = getNumeroRodas();
        tipo = getTipoVeiculo();
    }
    @Override
    public int getNumeroRodas(){
        return 8;
    }
    @Override
	public String getTipoVeiculo(){
        return "caminhao";
    }
}
