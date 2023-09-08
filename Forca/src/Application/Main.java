package Application;

import java.util.Collections;
import java.util.Scanner;

import Entities.BancoPalavras;
import Entities.Boneco;
import Entities.Controladora;
import Entities.Forca;
import Entities.Palavra;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BancoPalavras banco = new BancoPalavras(); 
		Boneco boneco = new Boneco();
		Controladora c = new Controladora();
		Forca f = new Forca();
		Palavra palavra = new Palavra(banco.sortear());
		
		char chute;
		String montar = String.join("", Collections.nCopies(palavra.palavraVez().length(), "_"));
		StringBuilder novo = new StringBuilder(montar);
		
		while(!c.jogoAcabou()) {
			System.out.println("Diga uma letra");
			chute = sc.next().charAt(0);
			sc.nextLine();
			
			if(palavra.existeNaPalavra(chute)) {
				c.montarPalavra(palavra.palavraVez(), novo, chute);
				c.setAcertos();
				f.setLetrasAcertadas(chute);
				if(palavra.palavraVez().equals(novo.toString())) {
					System.out.println("Voce ganhou");
					break;
				}
			}else {
				f.setLetrasErradas(chute);
				System.out.println(boneco.desenharMembro());
				c.setErros();
			}
			System.out.println(novo.toString());
			System.out.println("Letras certas");
			System.out.println(f.letrasCertas());
			System.out.println("Letras erradas");
			System.out.println(f.letrasErradas());
			System.out.println("Número de acertos = " + c.getAcertos());
			System.out.println("Número de erros = " + c.getErros());
		}
		if(c.getErros() >= 6) {
			System.out.println("Voce perdeu");
		}
		sc.close();
	}
}