package com.projetoFilas;

public class Fila<T> {

	private No<T> refNoEntradaFila;
	
	//instaciar a fila vazia
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	//adiciona novo No na fila
	public void enqueue(T object) {
		No novoNo = new No(object); //instanciando novoNo
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	//retorna o primeiro no
	public T first() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			//tornar primeiroNo o primeiroNo caso nao seja o primeiro da fila
			while(true){
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else { 
					break;
				}
			} return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			//tornar primeiroNo o primeiroNo caso nao seja o primeiro da fila
			while(true){
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else { 
					noAuxiliar.setRefNo(null); //primeiro no da fila
					break;
				}
			}
			return (T) primeiroNo.getRefNo();
		}
		return null;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true:false;
	}
	
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
			} else {
				stringRetorno = null;
		}
		
		return stringRetorno;
	}
}
