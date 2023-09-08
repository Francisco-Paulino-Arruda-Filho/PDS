package Entities;

public class ControladorAutor {
	private RepositorioAutor repositorioAutor = new RepositorioAutor();
	public ControladorAutor() {
	}
	public String retornarAutor(Integer idAutor) {
		return repositorioAutor.retornarAutor(idAutor);
	}
	public String lerListaAutoresIdENomes() {
		return repositorioAutor.lerListaAutoresIdENomes();
	}
}
