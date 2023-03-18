package com.projetoArvores;

//todo objeto adc ao no passa por um metodo de comparacao
public class BinNo<T extends Comparable<T>> {

	private T conteudo;
	private BinNo<T> noEsq;
	private BinNo<T> noDir;
	
	public BinNo (T conteudo){
		this.conteudo = conteudo;
		this.noEsq = this.noDir = null;
	}
	
	public BinNo() {
		
	}
	
	public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public String toString() {
        return "BinNo{" + "conteudo=" + conteudo + '}';
    }
	
}
