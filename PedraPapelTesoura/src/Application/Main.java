package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Controladora;
import Entities.Jogador;
import Entities.Jogo;
import Entities.Palpites;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Deseja iniciar o jogo?(y/n)");
		char aux = sc.next().charAt(0);
		Jogo jogo = new Jogo();
		
		if(jogo.iniciarJogo(aux)) {
			System.out.println("Digite seu nome");
			sc.nextLine();
			String nome = sc.nextLine();
			
			Jogador jogador = new Jogador(nome);
			Jogador computador = new Jogador("Máquina");
			Controladora controladora = new Controladora();
			
			System.out.println("Deseja jogar a primeira rodada?");
			char aux2 = sc.next().charAt(0);
			Palpites palpite1;
			
			while(jogo.jogarRodada(aux2)) {
				System.out.println("Digite seu palpite");
				palpite1 = Palpites.valueOf(sc.next());
				jogador.darPalpite(palpite1);
				computador.darPalpite(jogo.sortearPalpite());
				
				System.out.println(jogo.verificarVencedor(controladora.guardarPalpite1(jogador.getPalpite()), controladora.guardarPalpite2(computador.getPalpite())));
				controladora.atualizarPlacar(jogo.verificarVencedor(controladora.guardarPalpite1(jogador.getPalpite()), controladora.guardarPalpite2(computador.getPalpite())));
				
				System.out.println(controladora.placar(controladora.getVitorias1(), controladora.getVitorias2()));
				System.out.println("Deseja jogar de novo?");
				aux2 = sc.next().charAt(0);
				jogo.jogarRodada(aux2);
			}
			System.out.println(jogo.getVencedor(controladora.getVitorias1(), controladora.getVitorias2(), jogador.getNome() ,computador.getNome()));
		}
		System.out.println("Até a próxima");
		sc.close();
	}
}