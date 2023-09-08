package Entities;

public class Livro {
	private String nome;
	private Integer ano;
	private String autor;
	private String editora;
	public Livro(String nome, Integer ano, String autor, String editora) {
		this.nome = nome;
		this.ano = ano;
		this.autor = autor;
		this.editora = editora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String toString() {
		return String.format("Título: %s, Autor: %s, Editora: %s, Ano de lançamento: %d", nome, autor, editora, ano);
	}
}
