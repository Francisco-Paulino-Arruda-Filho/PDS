package Entities;

public class Controladora {
	private Integer erros;
	private Integer acertos;
	public Controladora() {
		erros = 0;
		acertos = 0;
	}
	public Integer getAcertos() {
		return acertos;
	}
	public void setAcertos() {
		acertos += 1;
	}
	public Integer getErros() {
		return erros;
	}
	public void setErros() {
		erros += 1;
	}
	public void montarPalavra(String palavra,StringBuilder montar, Character chute) {
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == chute) {
				montar.setCharAt(i, chute);
			}
		}
	}
	public boolean jogoAcabou() {
		if(getErros() >=  6) {
			return true;
		}else {
			return false;
		}
	}
}
