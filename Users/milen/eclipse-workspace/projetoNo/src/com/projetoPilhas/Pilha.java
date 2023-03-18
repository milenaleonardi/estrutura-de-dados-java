package com.projetoPilhas;

public class Pilha {

	No refNoEntradaPilha = null; // no de referencia
	
	/*public Pilha() {
		this.refNoEntradaPilha = null; //ao instanciar refNo é nulo
	}*/
	
	//retorna qual o no de referencia
	public No top() {
		return refNoEntradaPilha;
	}
	
	//acresenta um no no topo da pilha
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha; //guarda a referencia de entrada
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public No pop() {
		if(!isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
	}
		return null;
	}
	
	public boolean isEmpty() {
		/*if(refNoEntradaPilha == null) {
			return true;
		} 
		return false; */
		return refNoEntradaPilha == null ? true:false;
		
	}
	
	//imprime dados do no
	public String toString() {
		String stringRetorno = "-------------\n";
		stringRetorno += "	Pilha\n";
		stringRetorno += "-----------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado()+ "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}
		 else {
			break;
		}
		}
		stringRetorno = "-------------\n";
		return stringRetorno;
	
	}
	
}
