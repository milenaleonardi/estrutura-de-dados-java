package com.projetoListaDuplaEncadeada;

public class NoDuplo<T> {

	private T conteudo; //no a ser utilizado na lista duplamente encadeada
	private NoDuplo<T> noProximo; //referencia proximo no
	private NoDuplo<T> noPrevio;// referencia no anterior
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo; //conteudo do objeto recebe conteudo do parametro
	}
	
	public T getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public NoDuplo<T> getNoProximo() {
		return noProximo;
	}
	
	public void setNoProximo(NoDuplo<T> noProximo) {
		this.noProximo = noProximo;
	}
	
	public NoDuplo<T> getNoPrevio() {
		return noPrevio;
	}
	
	public void setNoPrevio(NoDuplo<T> noPrevio) {
		this.noPrevio = noPrevio;
	}
	
	public String toString() {
		return "[No{conteudo=" + conteudo + "}]";
	}
}
