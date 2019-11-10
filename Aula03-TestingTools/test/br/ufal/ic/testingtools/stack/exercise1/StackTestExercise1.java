package br.ufal.ic.testingtools.stack.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.ufal.ic.testingtools.stack.DesktopTests;
import br.ufal.ic.testingtools.stack.MainFrameTests;
import br.ufal.ic.testingtools.stack.Stack;

@Category({DesktopTests.class, MainFrameTests.class})
public class StackTestExercise1 {
	
	@Test
	public void testEmptyStack() {
		final Integer size = 10;
		Stack<Integer> stack	= new Stack<Integer>(size);
		stack = new Stack<Integer>(size);
		assertEquals("The initial stack is not empty", true, stack.empty());
	}
	
	@Test
	public void testPush() {
		final Integer size = 10;
		Stack<Integer> stack	= new Stack<Integer>(size);
			
		stack.push(90);
		stack.push(22);
		stack.push(18);
		assertEquals("The 'push test' is not correct", 18, stack.pop().intValue());
		assertEquals("The 'push test' is not correct", 22, stack.pop().intValue());
		assertEquals("The 'push test' is not correct", 90, stack.pop().intValue());
	}
	
	@Test
	public void testPushNull() {
		final Integer size = 10;
		Stack<Integer> stack	= new Stack<Integer>(size);
		
		stack.push(null);
		
		assertEquals("The 'push test null' is not correct", null, stack.pop());
	}
	
	
	@Test
	public void testPop() {
		final Integer size = 3;
		Stack<Integer> stack	= new Stack<Integer>(size);

		stack.push(5);
		stack.push(10);
		stack.push(15);
		
		assertEquals("The pop is not correct", 15, stack.pop().intValue());
		assertEquals("The pop is not correct", 10, stack.pop().intValue());
		assertEquals("The pop is not correct", 5, stack.pop().intValue());
		
	}

	@Test
	public void testPeek() {
		final Integer size = 2;
		Stack<Integer> stack	= new Stack<Integer>(size);

		stack.push(5);
		stack.push(10);
	
		assertEquals("The peek is not correct", 10, stack.peek().intValue());
		assertEquals("The pop is not correct", 10, stack.pop().intValue());
		assertEquals("The peek is not correct", 5, stack.peek().intValue());
	}
	

}
