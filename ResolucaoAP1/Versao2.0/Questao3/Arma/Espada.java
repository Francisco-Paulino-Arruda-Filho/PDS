package Arma;

public class Espada extends Arma{
    private String nome;
    private int preco; 

    public Espada(String nome, int preco) {
        super(nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int causarDano(){
        return 4;
    }
}
