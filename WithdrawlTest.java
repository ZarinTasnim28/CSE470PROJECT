
package tester;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import aSimulatorSystem.Withdrawl;



public class WithdrawlTest {
	
    Withdrawl W;
    @Before
    public void setUp() {
        W= new Withdrawl();
    }

 
    @Test
    public void testWithD() {
        assertEquals(0,W.withD(200, 200));
    }  
}
