package com.projetoFilas;

public class Main {
	public static void main(String[] args) {
		
		
		//refatorado utilizando generics
		//classe fila recebe qualquer tipo, objeto minhaFila recebe apenas strings
		Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
	
	}

