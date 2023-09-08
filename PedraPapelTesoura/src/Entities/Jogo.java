package Entities;

import java.util.Random;

public class Jogo {
	public String verificarVencedor(String palpite1, String palpite2) {
		if(palpite1.equals(palpite2)){
			return "Empate\n";
		}else if(palpite1.equals("tesoura") && palpite2.equals("papel")){
			return "Jogador 1 venceu a rodada\n";
		}else if(palpite1.equals("pedra") && palpite2.equals("tesoura")){
			return "Jogador 1 venceu a rodada\n";
		}else if(palpite1.equals("papel") && palpite2.equals("pedra")){
			return "Jogador 1 venceu a rodada\n";
		}else if(palpite1.equals("tesoura") && palpite2.equals("pedra")){
			return "Jogador 2 venceu a rodada\n";
		}else if(palpite1.equals("papel") && palpite2.equals("tesoura")){
			return "Jogador 2 venceu a rodada\n";
		}else{
			return "Jogador 2 venceu a rodada\n";
	    }
    }
	public String getVencedor(Integer vitorias1, Integer vitorias2, String nome1, String nome2) {
		if(vitorias1 > vitorias2) {
			return String.format("%s venceu", nome1);
		}else if(vitorias1 == vitorias2) {
			return "Empate\n";
		}else {
			return String.format("%s venceu", nome2);
		}
	}
	public Palpites sortearPalpite() {
		Random rand = new Random();
		int valor = rand.nextInt(3) - 1;
		if(valor == 0) {
			return Palpites.tesoura;
		}else if(valor == 1) {
			return Palpites.pedra;
		}else {
			return Palpites.papel;
		}
	}
	public boolean iniciarJogo(Character c) {
		if(c == 'y' || c == 'Y') {
			return true;
		}else {
			return false;
		}
	}
	public boolean jogarRodada(Character c) {
		if(c == 'y' || c == 'Y') {
			return true;
		}else {
			return false;
		}
	}
}