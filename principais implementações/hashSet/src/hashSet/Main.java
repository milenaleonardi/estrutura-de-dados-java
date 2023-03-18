package hashSet;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Pegeout"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(hashSetCarros);//nao segue a ordem de insercao
		Set<Carro> treeSetCarros = new TreeSet<>();
	
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Pegeout"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(treeSetCarros);//exibe em ordem de tamanho do conteudo
	}
}
