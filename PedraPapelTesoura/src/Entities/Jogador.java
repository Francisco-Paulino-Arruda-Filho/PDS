package Entities;

public class Jogador {
	private String nome;
	Palpites palpite;
	public Jogador(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void darPalpite(Palpites palpite) {
		this.palpite = palpite;
	}
	public String getPalpite() {
		return this.palpite.toString();
	}
}
