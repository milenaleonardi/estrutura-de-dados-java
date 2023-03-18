package stack;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro ("Ford"));
		stackCarros.push(new Carro ("Chevrolet"));
		stackCarros.push(new Carro ("Fiat"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());//remove o ultimo elemento adicionado
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek()); //visualizar ultimo elemento
		System.out.println(stackCarros.empty());//retorna se pilha esta vazia
	}
}
