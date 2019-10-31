package PilhaEncadeada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaEncadeadTeste {

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
	void pilhaTest() {
		PilhaEncadeada pilha = new PilhaEncadeada();
		Object raique = new Object();
		Object gabriel = new Object();
		Object alexandre = new Object();
		
		pilha.push(raique);
		pilha.push(gabriel);
		assertEquals(2, pilha.size());
		assertEquals(gabriel, pilha.top());
		pilha.pop();
		assertEquals(raique, pilha.top());
		assertEquals(false,pilha.isEmpty());
		pilha.push(alexandre);
		assertEquals(2, pilha.size());
		assertEquals(alexandre, pilha.top());
		pilha.pop();
		pilha.pop();
		assertEquals(0, pilha.size());
		assertEquals(null, pilha.top());
		assertEquals(true,pilha.isEmpty());
		
		
	}

}
