package tester;

import static org.junit.jupiter.api.Assertions.*;
import aSimulatorSystem.Transactions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionsTest {
           Transactions T;
	@BeforeEach
	void setUp() throws Exception {
		
		T= new Transactions();
	}

	@Test
	void testTrans() {
		assertEquals(500, T.trans(100, 200, 200) );
	
	}

}
