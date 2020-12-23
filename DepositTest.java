package tester;

import static org.junit.jupiter.api.Assertions.*;
import aSimulatorSystem.Deposit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class DepositTest {

	Deposit D;
	
	@BeforeEach
	void setUp() throws Exception {
		D= new Deposit();
	}

	@Test
	void testdepositedCash () {
		
		assertEquals(2050, D.depositedCash(2000,50));
	
	}

}
