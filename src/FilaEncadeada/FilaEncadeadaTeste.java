package FilaEncadeada;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaEncadeadaTeste {

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
	void sizeTest() {
		FilaEncadeada fila = new FilaEncadeada();
		Object raique = new Object();
		Object gabriel = new Object();
		Object alexandre = new Object();
		fila.enqueue(raique);
		fila.enqueue(gabriel);
		fila.enqueue(alexandre);
		assertEquals(3, fila.size());
		assertEquals(raique,fila.getFront());
		assertEquals(alexandre, fila.getRear());
		
	}

}
