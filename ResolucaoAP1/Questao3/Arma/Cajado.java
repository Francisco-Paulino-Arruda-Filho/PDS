package Arma;

public class Cajado extends Arma{
    private String nome;
    private int preco; 

    public Cajado(String nome, int preco) {
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
        return 6;
    }
}
