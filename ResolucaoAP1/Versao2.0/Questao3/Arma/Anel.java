package Arma;

public class Anel extends Arma{
    private String nome;
    private int preco; 

    public Anel(String nome, int preco) {
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
        return 2;
    }
}
