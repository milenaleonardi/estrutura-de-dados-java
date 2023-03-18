package com.projetoPilhas;

public class No {

	private int dado; // dados do no
	private No refNo = null; //referencia para proximo no
	
	//contrutor para atribuir valor ao dado
	public No(int dado) {
		this.dado = dado;
	}
	
	//contrutor generico
	public No() {
		
	}
	
	public int getDado() {
		return dado;
	}
	
	public void setDado(int dado) {
		this.dado = dado;
	}
	
	public No getRefNo() {
		return refNo;
	}
	
	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
	
	public String toString() {
		return "No{" + 
				"dado=" + dado + '}';
	}
}
