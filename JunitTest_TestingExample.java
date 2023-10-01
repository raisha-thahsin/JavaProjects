package lab2;

import static org.junit.Assert.*;



import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_TestingExample {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	
	@Test
	public void test1() {
		
		assertEquals("The function should give 1800 points in this situation", 1800, TestingExample.RewardPoints(1100, 500));
	}
	
	@Test
	 public void test2() {

		assertEquals("The function should give 1800 points in this situation", 1800, TestingExample.RewardPoints(1100, 500));
		
	}
	@Test
	 public void test3() {
		 double a=-1.0;
		 double b= 1.0;
		 int expt=-1;
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=-1.0 b=1.0",expt,act);
		
//		assertEquals( "The function should return -1", -1, TestingExample.RewardPoints(-1.0, 0.0));
		
	}
	@Test
	 public void test4() {
		 
		 double a=10;
		 double b= 15;
		 int expt=-1;
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=10.0 b=15.0",expt,act);
	
	}
	@Test
	 public void test5() {

		 
		 double a= 600;
		 double b= 100;
		 int res= 3*((int) (a-b));
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=600.0.0 b=100.00",res,act);
		
	}
	@Test
	 public void test6() {

		 
		 double a= 600;
		 double b= 200;
		 int res= 2*((int) (a-b));
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=600.0.0 b=200.00",res,act);
		
	}
	@Test
	 public void test7() {

		 
		 double a= 600;
		 double b= 400;
		 int res= ((int) (a-b));
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=600.0.0 b=400.00",res,act);
		
	}
	@Test
	 public void test8() {

		 
		 double a= 600;
		 double b= 500;
		 int res= ((int) (a-b));
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=600.0.0 b=500.00",res,act);
		
	}
	@Test
	 public void test9() {

		 
		 double a= 1000.00;
		 double b= 701.00;
		 int res= ((int) (a-b));
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=1000.0.0 b=701.00",res,act);
		
	}
	@Test
	 public void test10() {

		 
		 double a= 600;
		 double b= 600;
		 int res= 0;
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=600.0.0 b=400.00",res,act);
		
	}
	@Test
	 public void test11() {
		 double a=1.0;
		 double b=-1.0;
		 int expt=-1;
		 int act= TestingExample.RewardPoints(a, b);
		 assertEquals("Fail for a=-1.0 b=1.0",expt,act);
	}
	
	
}
