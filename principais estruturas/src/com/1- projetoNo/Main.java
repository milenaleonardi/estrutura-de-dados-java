package com.projetoNo;

public class Main {
	
	public static void main(String[] args) {
		No<String> no1 = new No<>("Conteudo no1"); //instanciar objeto no1 do tipo string
		No<String> no2 = new No<>("Conteudo no2");
		
		no1.setProximoNo(no2); //referencia para o proximo no
		No<String> no3 = new No<>("Conteudo no3");
		no2.setProximoNo(no3); //no2 referencia no3 como o  proximo no
		
		//no1 -> no2 -> no3 -> null
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no2);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo()); //imprime proximo no - no2
		System.out.println(no1.getProximoNo().getProximoNo()); //no3
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); //null
		

	}
	
}
