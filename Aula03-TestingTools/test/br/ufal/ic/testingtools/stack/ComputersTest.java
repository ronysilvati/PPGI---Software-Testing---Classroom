package br.ufal.ic.testingtools.stack;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ComputersTest {
	
	@Category(MainFrameTests.class)
	@Test(timeout = 50)
	public void testTimeRestrictionMainFrame() {
		Stack<Integer> myOtherStack = new Stack<Integer>(900000);
		for (int i = 0; i < 900000; i++) {
			myOtherStack.push(i);
		}
	}
	
	@Category(DesktopTests.class)
	@Test(timeout = 1000)
	public void testTimeRestrictionDesktop() {
		Stack<Integer> myOtherStack = new Stack<Integer>(1000000);
		for (int i = 0; i < 1000000; i++) {
			myOtherStack.push(i);
		}
	}
	
}
