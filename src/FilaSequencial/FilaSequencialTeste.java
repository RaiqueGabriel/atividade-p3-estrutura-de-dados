package FilaSequencial;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaSequencialTeste {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void enqueueAndDequeueTest() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue(1);
		fila.dequeue();
		fila.dequeue();
		assertEquals(0, fila.size());
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		assertEquals(4, fila.size());
		assertEquals(1, fila.getFront());
		assertEquals(4, fila.getRear());
		fila.dequeue();
		assertEquals(2, fila.getFront());
		fila.dequeue();
		fila.dequeue();
		assertEquals(4, fila.getFront());
		assertEquals(4, fila.getRear());
	}

}
