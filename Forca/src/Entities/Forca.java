package Entities;

import java.util.ArrayList;
import java.util.List;

public class Forca {
	String palavra;
	List<Character> acertos = new ArrayList<>();
	List<Character> erros = new ArrayList<>();
	public String letrasErradas(){
		return erros.toString();
	}
	public String letrasCertas(){
		return acertos.toString();
	}
	public void setLetrasAcertadas(Character chute) {
		acertos.add(chute);
	}
	public void setLetrasErradas(Character chute) {
		erros.add(chute);
	}
	public String palavraVez() {
		return palavra;
	}
}