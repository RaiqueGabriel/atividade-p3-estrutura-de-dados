package PilhaSequencial;

import java.util.Arrays;

public class PilhaSequencial {

	private static final int TAMANHO_INICIAL = 4;
	private static final int FATOR_DE_CRESCIMENTO = 2;
	Object[] pilha = new Object[TAMANHO_INICIAL];
	private int inseridos;
	
	public void push(Object obj) {
		if(inseridos == pilha.length) {
			doubleSize();
			pilha[inseridos] = obj;
			inseridos++;
		}else {
			pilha[inseridos] = obj;
			inseridos++;
		}
		
	}
	
	private void doubleSize() {
		Object[] tempList = new Object[pilha.length * FATOR_DE_CRESCIMENTO];
		for (int i = 0; i < pilha.length; i++) {
			tempList[i] = pilha[i];
		}
		pilha = tempList;
	}
	
	public void pop() {
		if(!isEmpty()) {
			pilha[inseridos-1] = null;
			inseridos--;
		}else {
			pilha[inseridos] = null;
		}
	}
	
	public Object top() {
		if(!isEmpty()) {
			return pilha[inseridos-1];
		}else {
			return null;
		}
	}
	
	public int size(){
		return inseridos;
	}
	
	public void clear() {
		for (int i = 0; i < pilha.length; i++) {
			pilha[i] = null;
		}
		this.inseridos = 0;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}

	@Override
	public String toString() {
		return "PilhaSequencial [pilha=" + Arrays.toString(pilha) + "]";
	}
	
}
