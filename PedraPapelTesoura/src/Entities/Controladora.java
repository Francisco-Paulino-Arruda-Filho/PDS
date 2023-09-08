package Entities;

public class Controladora {
	private Integer vitorias1;
	private Integer vitorias2;
	public Controladora() {
		this.vitorias1 = 0;
		this.vitorias2 = 0;
	}
	public Integer getVitorias1() {
		return vitorias1;
	}
	public void setVitorias1() {
		this.vitorias1 = vitorias1 + 1;
	}
	public Integer getVitorias2() {
		return vitorias2;
	}
	public void setVitorias2() {
		this.vitorias2 = vitorias2 + 1;
	}
	public String guardarPalpite1(String palpite1) {
		return palpite1.toString();
	}
	public String guardarPalpite2(String palpite2) {
		return palpite2.toString();
	}
	public void atualizarPlacar(String retorno) {
		if(retorno.equals("Jogador 1 venceu a rodada\n")) {
			setVitorias1();
		}else if(retorno.equals("Jogador 2 venceu a rodada\n")) {
			setVitorias2();
		}
	}
	public String placar(Integer vitorias1, Integer vitorias2) {
		return String.format("O jogador 1 possui %d vitórias\n", vitorias1) +
				String.format("O jogador 2 possui %d vitórias", vitorias2);
	}
}