package Entities;

import java.util.ArrayList;

public class RepositorioAutor {
	private ArrayList<Autor> autores = new ArrayList<>();
	public RepositorioAutor() {
		autores.add(new Autor("Machado de Assis"));
		autores.add(new Autor("Clarice Lispector"));
		autores.add(new Autor("José Saramago"));
		autores.add(new Autor("João Guimarães Rosa"));
		autores.add(new Autor("Carlos Drummond de Andrade"));
		autores.add(new Autor("Jorge Amado"));
		autores.add(new Autor("Graciliano Ramos"));
		autores.add(new Autor("Mário de Andrade"));
		autores.add(new Autor("Manuel Bandeira"));
		autores.add(new Autor("Lima Barreto"));
		autores.add(new Autor("Cecília Meireles"));
		autores.add(new Autor("Lygia Fagundes Telles"));
		autores.add(new Autor("Ariano Suassuna"));
		autores.add(new Autor("Conceição Evaristo"));
		autores.add(new Autor("Luís Fernando Veríssimo"));
		autores.add(new Autor("Cora Coralina"));
		autores.add(new Autor("Marina Colasanti"));
		autores.add(new Autor("Manoel de Barros"));
		autores.add(new Autor("Adélia Prado"));
		autores.add(new Autor("Hilda Hilst"));
		autores.add(new Autor("Millôr Fernandes"));
		autores.add(new Autor("Paulo Mendes Campos"));
		autores.add(new Autor("Antonio Callado"));
		autores.add(new Autor("Fernando Sabino"));
		autores.add(new Autor("Ivan Angelo"));
		autores.add(new Autor("Ana Cristina Cesar"));
		autores.add(new Autor("Chico Buarque"));
		autores.add(new Autor("Rubem Fonseca"));
		autores.add(new Autor("Luís Fernando Veríssimo"));
	}
	public String lerListaAutoresIdENomes() {
		String s = "[";
		for(Autor elem: autores) {
			s += elem.getNome() + ' ';
		}
		s += "]";
		return s;
	}
	public String retornarAutor(Integer idAutor) {
		return autores.get(idAutor).getNome();
	}
}
