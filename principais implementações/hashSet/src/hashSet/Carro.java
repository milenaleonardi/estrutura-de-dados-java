package hashSet;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

	String marca;
	
	public Carro(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//comparando se um carro é igual ao outro pelo atributo marca
	public boolean equals(Object o) {
		if(this == o)return true; //testar se o objeto instanciado e igual ao objeto passado por parametro
		if (o == null || getClass() != o.getClass()) return false;//testa se objeto e nulo ou se objeto sao de classes diefreentes
		Carro carro = (Carro) o; //criacao temporaria de objeto carro
		return Objects.equals(marca, carro.marca); //retorna se um objeto e igual ao outro considerando o atributo marca
	}
	
	//retorna numero inteiro(hash) gerado a partir do atributo marca para organizar dados de objetos
	public int hashCode() {
		return Objects.hash(marca);
	}
	
	public String toString() {
		return "[Carro{marca=" + marca + "]}";
	}

	//adicionado por ordem de tamanho
//	public int compareTo(Carro o) {
//		if(this.marca.length() < o.marca.length()) {
//			return -1;
//		} else if(this.marca.length() > o.marca.length()) {
//			return 1;
//		}
//		return 0;
//	}
	
	//adicionado por ordem alfabetica
	public int compareTo(Carro o) {
		return this.getMarca().compareTo(o.getMarca());
	}
}

