package PilhaSequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaSequencialTeste {

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
		PilhaSequencial pilhao = new PilhaSequencial();
		pilhao.push(1);
		assertEquals(1, pilhao.size());
		pilhao.pop();
		assertEquals(0,pilhao.size());
		pilhao.push(1);
		pilhao.push(2);
		assertEquals(2, pilhao.size());
		pilhao.pop();
		pilhao.pop();
		assertEquals(0,pilhao.size());
		pilhao.pop();
		assertEquals(0,pilhao.size());
		
	}
	
	@Test
	void pushTest() {
		PilhaSequencial pilhao = new PilhaSequencial();
		pilhao.push(1);
		pilhao.push(2);
		pilhao.push(3);
		pilhao.push(4);
		pilhao.push(5);
		pilhao.push(6);
		assertEquals(6,pilhao.size());
		assertEquals(6, pilhao.top());
	}
	
	@Test 
	void popTest(){
		PilhaSequencial pilhao = new PilhaSequencial();
		pilhao.push(1);
		pilhao.push(2);
		pilhao.push(3);
		assertEquals(3, pilhao.top());
		pilhao.pop();
		assertEquals(2, pilhao.top());
	}
	
	@Test
	void clearTest() {
		PilhaSequencial pilhao = new PilhaSequencial();
		pilhao.push(1);
		pilhao.push(2);
		assertEquals(2,pilhao.size());
		pilhao.clear();
		assertEquals(0, pilhao.size());
		assertEquals(null, pilhao.top());
	}
	
	@Test
	void isEmptyTest() {
		PilhaSequencial pilhao = new PilhaSequencial();
		pilhao.push(1);
		pilhao.push(2);
		assertEquals(false, pilhao.isEmpty());
		pilhao.pop();
		pilhao.pop();
		assertEquals(true, pilhao.isEmpty());
		
	}

}
