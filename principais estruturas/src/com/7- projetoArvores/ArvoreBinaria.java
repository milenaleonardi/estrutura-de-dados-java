package com.projetoArvores;

public class ArvoreBinaria<T extends Comparable <T>> {

	private BinNo<T> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void inserir(T conteudo) {
		BinNo<T> novoNo = new BinNo<>(conteudo);
		this.raiz = inserir(raiz, novoNo);
	}
	
	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
		if(atual == null) {
			return novoNo; //raiz da arvore
		} else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
		} else {
			atual.setNoDir(inserir(atual.getNoDir(),novoNo));
		}
		return atual;
	}
	
	public void remover(T conteudo) {
		try {
			BinNo<T> atual = this.raiz;
			BinNo<T> pai = null;
			BinNo<T> filho = null;
			BinNo<T> temp = null;
			
			while(atual != null && atual.getConteudo().equals(conteudo)) {
				pai = atual;
				if(conteudo.compareTo(atual.getConteudo()) < 0) {
					atual = atual.getNoEsq();
					} else {
						atual = atual.getNoDir();
				}
				
			}
			
			if(atual == null) {
				System.out.println("Conteudo não encontrado. Bloco Try");
			}
			
			//pai e a raiz
			if(pai == null) {
				if(atual.getNoDir() == null) {
					this.raiz = atual.getNoEsq();
				} else if(atual.getNoEsq() == null) {
					this.raiz = atual.getNoDir();
				}else {
					for(temp = atual, filho = atual.getNoEsq();
							filho.getNoDir() != null;
							temp = filho, filho = filho.getNoEsq()
						){
					if(filho != atual.getNoEsq()) {
						temp.setNoDir(filho.getNoEsq());
						filho.setNoEsq(raiz.getNoEsq());
					}
					filho.setNoDir(raiz.getNoDir());
					raiz = filho;
					}
				}
				//referencia do no a direita e null
			} else if(atual.getNoDir() == null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoEsq()); //se for null a referencia do no pai e a mesma do no atual
				} else {
					pai.setNoDir(atual.getNoEsq());
				}
			} else if(atual.getNoEsq() == null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoDir());
					} else {
					pai.setNoDir(atual.getNoDir());
				}
			} else {
				for(temp = atual, filho = atual.getNoEsq();
						filho.getNoDir() != null;
						temp = filho, filho = filho.getNoDir()
					) {
					if(filho != atual.getNoEsq()) {
						temp.setNoDir(filho.getNoEsq());
						filho.setNoEsq(atual.getNoEsq());
					}
					filho.setNoDir(atual.getNoDir());
					if(pai.getNoEsq() == atual) {
						pai.setNoEsq(filho);
					}else {
						pai.setNoDir(filho);
					}
				}
			}
			
		}catch(NullPointerException erro) {
			System.out.println("Conteudo não encontrado. Bloco Catch");
		}
	}
	
	public void exibirInOrdem() {
		System.out.println("\n Exibição InOrdem");
		exibirInOrdem(this.raiz);
	}
	
	private void exibirInOrdem(BinNo<T> atual) {
		if(atual != null) {
			exibirInOrdem(atual.getNoEsq());
			System.out.println(atual.getConteudo() + ",");
			exibirInOrdem(atual.getNoDir());
		}
	}
	
	public void exibirPosOrdem() {
		System.out.println("\n Exibição PosOrdem");
		exibirPosOrdem(this.raiz);
	}
	
	private void exibirPosOrdem(BinNo<T> atual) {
		if(atual != null) {
			exibirPosOrdem(atual.getNoEsq());
			exibirPosOrdem(atual.getNoDir());
			System.out.println(atual.getConteudo() + ",");
		}
	}
	
	public void exibirPreOrdem() {
		System.out.println("\n Exibição PreOrdem");
		exibirPreOrdem(this.raiz);
	}
	
	private void exibirPreOrdem(BinNo<T> atual) {
		if(atual != null) {
			System.out.println(atual.getConteudo() + ",");
			exibirPreOrdem(atual.getNoEsq());
			exibirPreOrdem(atual.getNoDir());
		}
	}
	
}
