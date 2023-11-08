
public class Exemplo {

	public static void main(String[] args) {
		Exemplo exemplo = new Exemplo();
		exemplo.inicia();
	}
	public void inicia() {
		PaoBola pao = new PaoBola();
		
		Ovo paoComOvo = new Ovo(pao);
		
		System.out.println("Pao bola com ovo: " + paoComOvo.lePreco());
		
		PaoBrioche brioche = new PaoBrioche();
		Ovo paoBriocheComOvo = new Ovo(brioche);
		System.out.println("Pao brioche com ovo: " + paoBriocheComOvo.lePreco());
		
		Carne paoBriocheComOvoComCarne = new Carne(paoBriocheComOvo);
		Presunto paoBriocheComOvoComCarneComPresunto = new Presunto(paoBriocheComOvoComCarne);
	}
}
