package com.projetoFilas;

public class No<T> {

		private T object;
		private No<T> refNo = null; //referencia para proximo no
		
		//contrutor para atribuir valor ao dado
		public No(T object) {
			this.refNo = null;
			this.object = object;
		}
		
		//contrutor generico
		public No() {
			
		}
		
		public Object getObject() {
			return object;
		}
		
		public void setObject(T object) {
			this.object = object;
		}
		
		public No getRefNo() {
			return refNo;
		}
		
		public void setRefNo(No refNo) {
			this.refNo = refNo;
		}
		
		public String toString() {
			return "No{" + 
					"object=" + object + '}';
		}
	}

