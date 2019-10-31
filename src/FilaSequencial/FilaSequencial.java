package FilaSequencial;

public class FilaSequencial {
	
	private static final int TAMANHO_INICIAL = 4;
	private static final int FATOR_DE_CRESCIMENTO = 2;
	private static final int INICIAL = 0;
	Object[] fila = new Object[TAMANHO_INICIAL];
	private int inseridos;

	public void enqueue(Object obj) {
		if(inseridos == fila.length){
			doubleSize();
			fila[inseridos] = obj;
			inseridos++;
		}else {
			fila[inseridos] = obj;
			inseridos++;
		}
	}
	
	private void doubleSize() {
		Object[] tempList = new Object[fila.length * FATOR_DE_CRESCIMENTO];
		for (int i = 0; i < fila.length; i++) {
			tempList[i] = fila[i];
		}
		fila = tempList;
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			fila[INICIAL] = null;
			moveFila();
			inseridos--;
		}else {
			fila[INICIAL] = null;
		}
		
	}
	
	private void moveFila() {
		for (int i = 1; i < fila.length; i++) {
			fila[i-1] = fila[i];
		}
	}

	public int size() {
		return inseridos;
	}
	
	public Object getFront() {
		if(isEmpty()) {
			return null;
		}else {
			return fila[INICIAL];
		}
	}
	
	public Object getRear() {
		if(isEmpty()) {
			return fila[INICIAL];
		}else {
			return fila[inseridos-1];
		}
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
}
