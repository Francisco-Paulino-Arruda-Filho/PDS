package Entities;

public class Palavra {
	String palavra;
	public Palavra(String palavra) {
		this.palavra = palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String dica() {
		return "Dica";
	}
	public boolean existeNaPalavra(Character chute) {
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == chute) {
				return true;
			}
		}
		return false;
	}
	public String palavraVez() {
		return this.palavra;
	}
}
