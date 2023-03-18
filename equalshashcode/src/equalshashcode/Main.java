package equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Volkswagen"));
		
		
		//retorna se existe objeto com conteudo "Ford" comparando o parametro especificado
		System.out.println(listaCarros.contains(new Carro("Ford")));
		//retorna hash do objeto de conteudo "Ford"
		System.out.println(new Carro("Ford").hashCode());
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Chevrolet");
		
		//retorna se o conteudo dos dois objetos sao iguais
		System.out.println(carro1.equals(carro2));
		
	}
}
