public class caminhao extends Veiculo{
    int numRodas;
    public caminhao(String chassi, String tipo){
        super(chassi, tipo);
		numRodas = getNumeroRodas();
	}
    @Override
    public int getNumeroRodas(){
        return 8;
    }
}
