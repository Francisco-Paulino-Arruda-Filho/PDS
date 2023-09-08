package Application;

import java.util.Scanner;

import Entities.Tela;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tela tela = new Tela();
		
		System.out.println("Deseja adicionar livro?");
		char c = sc.next().charAt(0);
		String titulo;
		int idAutor;
		int idEditora;
		int ano;
		
		while(tela.abrirTela(c)) {
			sc.nextLine();
			System.out.println("Digite o título");
			titulo = sc.nextLine();
			System.out.println("Digite o id do Autor");
			idAutor = sc.nextInt();
			System.out.println("Digite o id da Editora");
			idEditora = sc.nextInt();
			System.out.println("Digite o ano de lançamento");
			ano = sc.nextInt();
			tela.adicionarLivro(titulo, idAutor, idEditora, ano);
			System.out.println("Deseja adicionar outro livro?");
			c = sc.next().charAt(0);
		}
		System.out.println(tela.mostrarListaLivros());
		System.out.println("Até a próxima");
		
		sc.close();
	}

}
