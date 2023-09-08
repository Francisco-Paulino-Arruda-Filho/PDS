package Entities;

import java.util.ArrayList;

public class RepositorioLivro {
	private ArrayList<Livro> livros = new ArrayList<>();
	public RepositorioLivro() {
	}
	public void adicionarLivro(String titulo, String autor, String editora, Integer ano) {
		livros.add(new Livro(titulo, ano,autor, editora));
	}
	public String lerListaLivros() {
		String s = "[";
		for(Livro elem: livros) {
			s += elem.toString() + '\n';
		}
		s += "]";
		return s;
	}
}
