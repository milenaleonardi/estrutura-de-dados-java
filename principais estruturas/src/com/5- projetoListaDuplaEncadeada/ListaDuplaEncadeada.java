package com.projetoListaDuplaEncadeada;

public class ListaDuplaEncadeada<T> {

	private NoDuplo<T> primeiroNo = null;
	private NoDuplo<T> ultimoNo = null;
	
	private int tamanhoLista = 0;
	
	//mostra o elemento da lista de indice especificado
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}

	//retornar no de indice especificado
	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = primeiroNo;
		
		for(int i = 0; (i < index) && (noAuxiliar != null ); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(null); //adc ao final da lista encadeada, sendo conteudo null
		novoNo.setNoPrevio(ultimoNo); //antigo ultimo No
		
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		ultimoNo = novoNo; //adc novo no no ultimo no
		tamanhoLista++;
	}
	
	//sobrecarga metodo add
	public void add(int index, T elemento) {
		NoDuplo<T> noAuxiliar = getNo(index); //recebe no de determiando indice
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo()!= null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);; 
		} else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		} else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		tamanhoLista++;
		
	}
	
	//remocao de no da lista
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getNoProximo(); //proximo no se torna o primeiro caso indice do no removido seja 0
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		} else {
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo()); //alteracao de referencia do proximo no
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio()); //alteracao de referencia do no anterior
			} else {
				ultimoNo = noAuxiliar;
			}
		}
		
		this.tamanhoLista--;
		
	}
	
	//retorna o tamanho atual da lista
	public int size(){
		return tamanhoLista;
	}
	
	public String toString() {
		String strRetorno = "";
		
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; i < size(); i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		strRetorno += "null";
		return strRetorno;
	}
 	
}
