package DequeSequencial;

public class DequeSequencial {
	
	private int inseridos;
	private static final int TAMANHO_INICIAL = 3;
	private static final int INICIAL = 0;
	private static final int FATOR_DE_CRESCIMENTO = 2;
	Object[] deque = new Object[TAMANHO_INICIAL];
	
	
	public int size() {
		return inseridos;
	}
	
	public void insertFront(Object obj) {
		if(deque[INICIAL] == null) {
			deque[INICIAL] = obj;
			inseridos++;
		}else {
			moveRightAndDouble();
			deque[INICIAL] = obj;
			inseridos++;
		}
	}
	
	private void moveRight() {
		Object[] tempDeque = new Object[deque.length];
		for (int i = 0; i < deque.length; i++) {
			tempDeque[i+1] = deque[i]; 
		}
		deque = tempDeque;
	}
	
	private void moveRightAndDouble() {
		if(inseridos == deque.length) {
			doubleSize();
			moveRight();
		}else {
			moveRight();
		}
	}

	private void doubleSize() {
		Object[] tempDeque = new Object[TAMANHO_INICIAL * FATOR_DE_CRESCIMENTO];
		for (int i = 0; i < deque.length; i++) {
			tempDeque[i] = deque[i];
		}
		deque = tempDeque;
	}

	public void insertLast(Object obj) {
		if(inseridos == deque.length) {
			doubleSize();
			deque[inseridos] = obj;
			inseridos++;
		}else {
			deque[inseridos] = obj;
			inseridos++;
		}
	}
	
	public void deleteFront() {
		if(!isEmpty()) {
			deque[INICIAL] = null;
			moveLeft();
			inseridos--;
		}
	}
	
	private void moveLeft() {
		Object[] tempDeque = new Object[deque.length-1];
		int j = 1;
		for (int i = 0; i < deque.length; i++) {
			tempDeque[i] = deque[j];
			j++;
		}
		deque = tempDeque;
	}

	public void deleteLast() {
		if(!isEmpty()) {
			deque[inseridos-1] = null;
			inseridos--;
		}
	}
	
	public Object getFront() {
		return deque[INICIAL];
	}
	
	public Object getRear() {
		return deque[deque.length];
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}

}
