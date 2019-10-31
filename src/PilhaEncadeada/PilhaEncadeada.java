package PilhaEncadeada;

public class PilhaEncadeada {
	
	private Object inicio;
	private Object fim;
	private int inseridos;
	
	public void push(Object obj) {
		if(isEmpty()) {
			inicio = obj;
			fim = obj;
			inseridos++;
		}else {
			fim.proximo = obj;
			fim = obj;
			inseridos++;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			Object temp = inicio;
			while(temp.proximo != fim && temp.proximo != null) {
				temp = temp.proximo;
			}
			fim = temp;
			inseridos--;
		}else {
			inicio = null;
			fim = null;
		}
		
	}

	public Object top() {
		return fim;
	}
	
	public int size(){
		return inseridos;
	}
	
	public void clear() {
		inicio = null;
		fim = null;
		inseridos = 0;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}

}
