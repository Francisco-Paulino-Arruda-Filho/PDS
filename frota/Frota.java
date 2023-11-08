import java.util.ArrayList;

public class Frota {
	private ArrayList<Veiculo> veiculos;
	private ArrayList<temRodas> rodas;
	private Funcionario gerente;
	
	public Frota(Funcionario gerente) {
		veiculos = new ArrayList<Veiculo>();
		rodas = new ArrayList<temRodas>();
		this.gerente = gerente;
	}
	
	public int leNumeroRodas() {
		int rodas = 0;
		for (Veiculo v: veiculos) {
			/*if (v.leTipo().equals("carro")){
				rodas += 4;
			} else if (v.leTipo().equals("moto")){
				rodas += 2;
			} else if (v.leTipo().equals("caminh�o")){
				rodas += 8;
			}*/
			rodas += v.getNumeroRodas();
		}
		return rodas;
	}
	
	public void adicionaVeiculo(Veiculo v){
		this.veiculos.add(v);
	}
}
