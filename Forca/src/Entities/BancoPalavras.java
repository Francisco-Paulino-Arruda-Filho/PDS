package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoPalavras {
	private List<String> banco = new ArrayList<>();
	Random rand = new Random();
	public BancoPalavras() {
		banco.add("leao");
		banco.add("barco");
		banco.add("cavalo");
		banco.add("predio");
		banco.add("carro");
		banco.add("janela");
		banco.add("travesseiro");
		banco.add("ventilador");
		banco.add("arvore");
		banco.add("mentira");
		banco.add("mae");
		banco.add("cadeira");
		banco.add("caneta");
		banco.add("livro");
		banco.add("telefone");
		banco.add("computador");
		banco.add("chocolate");
		banco.add("abacaxi");
		banco.add("banana");
		banco.add("elefante");
		banco.add("girafa");
		banco.add("pipoca");
		banco.add("teclado");
		banco.add("piano");
		banco.add("lapis");
		banco.add("borboleta");
		banco.add("morango");
		banco.add("geladeira");
		banco.add("espelho");
		banco.add("sorvete");
		banco.add("chuveiro");
		banco.add("meia");
		banco.add("tigre");
		banco.add("flor");
		banco.add("praia");
		banco.add("melancia");
		banco.add("sol");
		banco.add("lua");
		banco.add("estrela");
		banco.add("sapato");
		banco.add("chapeu");
		banco.add("Lembrete");
		banco.add("guarda-chuva");
		banco.add("bicicleta");
		banco.add("cadeado");
		banco.add("aviao");
		banco.add("escova");
		banco.add("pincel");
		banco.add("bola");
		banco.add("guitarra");
		banco.add("violino");
		banco.add("celular");
		banco.add("relogio");
		banco.add("camiseta");
		banco.add("calça");
		banco.add("meia");
		banco.add("cachorro");
		banco.add("gato");
	}
	public String sortear() {
		int valor = rand.nextInt(banco.size()) - 1;
		return banco.get(valor);
	}
}
