package Entities;

public class Tela {
	ControladorAutor controladorAutor = new ControladorAutor();
	ControladorLivro controladorLivro = new ControladorLivro();
	ControladorEditora controladorEditora = new ControladorEditora();
	public boolean abrirTela(Character c) {
		if(c == 'y' || c == 'Y') {
			System.out.println(controladorAutor.lerListaAutoresIdENomes());
			System.out.println(controladorEditora.lerListaEditorasIdENomes());
			return true;
		}else {
			return false;
		}
	}
	public void adicionarLivro(String titulo, Integer idAutor, Integer IdEditora, Integer ano) {
		controladorLivro.adicionarLivro(titulo, controladorAutor.retornarAutor(idAutor), controladorEditora.retornaEditora(IdEditora), ano);
	}
	public String mostrarListaLivros() {
		return controladorLivro.retornaListaLivros();
	}
}
