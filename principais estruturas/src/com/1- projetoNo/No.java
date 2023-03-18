package com.projetoNo;

public class No<T> // classe que aceita tipo generico 
{

	private T conteudo; //variavel para conteudo do no
	private No<T> proximoNo; //referencia para o proximo no tipo No
							// conteudo do no vai ser sempre do tipo T
	
	//contrutor recebe conteudo
	public No(T conteudo) {
		this.proximoNo = null; //referencia null para o proximo no
		this.conteudo = conteudo;
	}
	
	public T getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public No<T> getProximoNo() {
		return proximoNo;
	}
	
	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	public String toString() {
		return "No{" + "conteudo=" + conteudo + "}";
	}
}
