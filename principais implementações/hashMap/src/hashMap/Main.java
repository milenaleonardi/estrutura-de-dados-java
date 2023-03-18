package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Map<String, String> /*<Chave, Valor*/ aluno = new HashMap<>();
		
		aluno.put("Nome", "Joao");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3A");
		
		
		System.out.println(aluno);
		
		System.out.println(aluno.keySet());//retorna os atributos sem conteudo
		System.out.println(aluno.values());//retorna somente os valores
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
				
		Map<String, String> aluno2 = new HashMap<>();

		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Media", "9.0");
		aluno2.put("Turma", "3B");
		
		listaAlunos.add(aluno2);
		System.out.println(listaAlunos);
		
		System.out.println(aluno.containsKey("Nome"));//retorna se existe o objeto chave
	}
}
