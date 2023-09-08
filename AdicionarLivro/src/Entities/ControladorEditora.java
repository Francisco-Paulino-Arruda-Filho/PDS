package Entities;

public class ControladorEditora {
	private RepositorioEditora repositorioEditora = new RepositorioEditora();
	public ControladorEditora() {
	}
	public String retornaEditora(Integer idEditora) {
		return repositorioEditora.retornaEditora(idEditora);
	}
	public String lerListaEditorasIdENomes() {
		return repositorioEditora.lerListaEditorasIdENomes();
	}
}
