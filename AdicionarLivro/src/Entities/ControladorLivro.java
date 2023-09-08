package Entities;

public class ControladorLivro {
	private RepositorioLivro repositorioLivro = new RepositorioLivro();
	public ControladorLivro() {
	}
	public void adicionarLivro(String titulo, String autor, String editora, Integer ano) {
		repositorioLivro.adicionarLivro(titulo, autor, editora, ano);
	}
	public String retornaListaLivros() {
		return repositorioLivro.lerListaLivros();
	}
}