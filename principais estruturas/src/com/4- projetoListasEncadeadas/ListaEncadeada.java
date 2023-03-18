package com.projetoListasEncadeadas;

public class ListaEncadeada<T> {

	private No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null ? true:false;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No(conteudo);
		
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
			}
		
		//definicao proximo no
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		noAuxiliar.setProximoNo(novoNo);
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
			int ultimoIndice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteudo no indice" + index + "desta lista.");
		}
	}
	
	//retorna conteudo do No
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	//validação do indice, retorna o No
	private No<T> getNo(int index){
		
		validaIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno; 
	}
	
	//remover no em determindo index
	public T remove(int index){
		
		No<T> noPivor = this.getNo(index);
		if(index == 0) { //removendo primeiro no
			referenciaEntrada = noPivor.getProximoNo(); //o novo no de referencia e o proximo no
			return noPivor.getConteudo(); //conteudo do no removido
		}
		
		No<T> noAnterior = getNo(index - 1); //selecioanndo no anterior
		noAnterior.setProximoNo(noPivor.getProximoNo()); //Proximo no é o da frente
		return noPivor.getConteudo();
	}
	
	//tamanho da lista
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getProximoNo() != null) {//existe no a frente {
					referenciaAux = referenciaAux.getProximoNo(); // navegar ate o proximo no				} else {
			} else {
				break;
			}
			} else {
				break;
			}
		}
		
		
		return tamanhoLista;
	}
	
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "No{conteudo=" + noAuxiliar.getConteudo() + "}---->";
			noAuxiliar = noAuxiliar.getProximoNo(); //noAuxiliar passa a ser o no a sua frente		}
		}
		strRetorno += "null";
		return strRetorno;
		
	}
}



