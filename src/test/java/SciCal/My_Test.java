package SciCal;
import static org.junit.Assert.*;
import org.junit.Test;

public class My_Test {
    private static final double DELTA = 1e-15;
    My_Main calculator = new My_Main();
	@Test
	public void test_root() {
		double actual=calculator.root(36.0);
		double exp=6.0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact() {
		double actual=calculator.factorial(3);
		double exp=6;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log() {
		double actual=calculator.log(1);
		double exp=0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power() {
		double actual=calculator.power(3.0,2.0);
		double exp=9.0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_root2() {
		double actual=calculator.root(19.0);
		double exp=3.0;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact2() {
		double actual=calculator.factorial(4);
		double exp=8;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log2() {
		double actual=calculator.log(26);
		double exp=76740;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power2() {
		double actual=calculator.power(4.0,9.0);
		double exp=12.0;
		assertNotEquals(actual,exp, DELTA);
	}
}
