package Entities;

import java.util.ArrayList;

public class RepositorioEditora {
	private ArrayList<Editora> editoras = new ArrayList<>();
	public RepositorioEditora() {
		editoras.add(new Editora("Companhia das Letras"));
		editoras.add(new Editora("Grupo Editorial Record"));
		editoras.add(new Editora("Sextante"));
		editoras.add(new Editora("Intrínseca"));
		editoras.add(new Editora("Grupo Editorial Alta Books"));
		editoras.add(new Editora("Rocco"));
		editoras.add(new Editora("DarkSide Books"));
		editoras.add(new Editora("Editora Globo"));
		editoras.add(new Editora("HarperCollins Brasil"));
		editoras.add(new Editora("Editora Gente"));
		editoras.add(new Editora("Editora Record"));
		editoras.add(new Editora("Editora Melhoramentos"));
		editoras.add(new Editora("Editora Abril"));
		editoras.add(new Editora("Editora Ediouro"));
		editoras.add(new Editora("Editora Saraiva"));
		editoras.add(new Editora("Editora Moderna"));
		editoras.add(new Editora("Editora Scipione"));
		editoras.add(new Editora("Editora Positivo"));
	}
	public String retornaEditora(Integer idEditora) {
		return editoras.get(idEditora).getNome();
	}
	public String lerListaEditorasIdENomes() {
		String s = "[";
		for(Editora elem: editoras) {
			s += elem.getNome() + " ";
		}
		s += "]";
		return s;
	}
}
