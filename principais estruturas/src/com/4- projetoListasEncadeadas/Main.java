package com.projetoListasEncadeadas;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada();
		
		minhaListaEncadeada.add("teste 1");
		minhaListaEncadeada.add("teste 2");
		minhaListaEncadeada.add("teste 3");
		minhaListaEncadeada.add("teste 4");

		System.out.println(minhaListaEncadeada.get(0)); //mostra no de indice 0 = teste 1
		System.out.println(minhaListaEncadeada); //mostra todos os conteudos do no com o toString
	
		System.out.println(minhaListaEncadeada.remove(3)); //remove no de indice 3 = teste 4
	}
	
}
