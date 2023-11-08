package BuilderFactory;
import java.util.ArrayList;

public class Frota {
	private ArrayList<Veiculo> veiculos;
	private Funcionario gerente;
	
	public Frota() {
		veiculos = new ArrayList<Veiculo>();
		gerente = new Funcionario("Paulino");
	}
	
	public int leNumeroRodas() {
		int rodas = 0;
		for(Veiculo v: veiculos){
			rodas += v.getNumeroRodas();
		}
		return rodas;
	}
	
	public void adicionaVeiculo(Veiculo v){
		this.veiculos.add(v);
	}
}