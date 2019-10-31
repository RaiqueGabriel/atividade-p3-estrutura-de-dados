package FilaEncadeada;

public class FilaEncadeada {
	
	private Object inicio;
	private Object fim;
	private int inseridos;
	
	public void enqueue(Object obj) {
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
	
	public void dequeue() {
		if(!isEmpty()) {
			Object temp = inicio;
			while(temp.proximo != fim) {
				temp = temp.proximo;
			}
			fim = temp;
		}
	}
	
	public int size() {
		return inseridos;
	}
	
	public Object getFront() {
		return fim;
	}
	
	public Object getRear() {
		return inicio;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
}
