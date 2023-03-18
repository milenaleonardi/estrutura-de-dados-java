package array;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro ("Ford"));
		listCarros.add(new Carro ("Chevrolet"));
		listCarros.add(new Carro ("Fiat"));
		listCarros.add(new Carro("Pegeout"));
		
		System.out.println(listCarros.contains(new Carro("Ford")));//testa se contem carro ford no array
		System.out.println(listCarros.get(2));//remove o ultimo elemento adicionado
		System.out.println(listCarros.indexOf(new Carro("Fiat")));//retorna o indice que contem o conteudo Ford

		System.out.println(listCarros.remove(2));//remove objeto de indice 2
		System.out.println(listCarros);
	}
}
	
