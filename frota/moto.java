public class moto extends Veiculo{
    int numRodas;
	public moto(String chassi, String tipo){
        super(chassi, tipo);
		numRodas = getNumeroRodas();
	}
    @Override
    public int getNumeroRodas(){
        return 2;
    }
}
