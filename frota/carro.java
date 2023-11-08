public class carro extends Veiculo{
    int numRodas;
	public carro(String chassi, String tipo){
        super(chassi, tipo);
		numRodas = getNumeroRodas();
	}
    @Override
    public int getNumeroRodas(){
        return 4;
    }
}
