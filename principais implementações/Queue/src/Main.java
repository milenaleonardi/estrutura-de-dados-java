

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));
		
		System.out.println(queueCarros.add(new Carro("Pegeout")));//retorna se foi adicionado o novo objeto, caso nao retorna erro
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.offer(new Carro("Renault")));//retorna false caso nao consiga adicionar
		
		System.out.println(queueCarros.peek());//mostra primeiro elemento da fila, caso nao exista retorna nulo
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());//remove o primero da fila
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());//retorna se a fila esta vazia
		
		System.out.println(queueCarros.size());//retorna a quantidade de elementos na fila
		}
}
