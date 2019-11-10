package br.ufal.ic.testingtools.stack.exercise3;

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
public class StackTestExercise3 {
	
	Stack<Integer> stack	= null;
	Integer size = 10;
	
	@Before
	public void beforeTest() {
		this.size = 10;
		this.stack = new Stack<Integer>(size);
		this.stack.push(90);
		this.stack.push(22);
		this.stack.push(18);
	}
	
	@After
	public void afterTest() {
		this.size = 10;
	}
	
	@Test
	public void testEmptyStack() {
		this.stack = new Stack<Integer>(this.size);
		assertEquals("The initial stack is not empty", true, stack.empty());
	}
	
	@Test
	public void testPush() {
		this.stack.push(90);
		this.stack.push(22);
		this.stack.push(18);
		assertEquals("The 'push test' is not correct", 18, this.stack.pop().intValue());
		assertEquals("The 'push test' is not correct", 22, this.stack.pop().intValue());
		assertEquals("The 'push test' is not correct", 90, this.stack.pop().intValue());
	}
	
	@Test
	public void testPushNull() {
		this.stack.push(null);
		
		assertEquals("The 'push test null' is not correct", null, this.stack.pop());
	}
	
	@Test
	public void testPop() {
		this.size = 3;
		this.stack = new Stack<Integer>(this.size);
		this.stack.push(5);
		this.stack.push(10);
		this.stack.push(15);
		
		assertEquals("The pop is not correct", 15, this.stack.pop().intValue());
		assertEquals("The pop is not correct", 10, this.stack.pop().intValue());
		assertEquals("The pop is not correct", 5, this.stack.pop().intValue());
		
	}
	
	@Test
	public void testPeek() {
		this.size = 2;
		this.stack = new Stack<Integer>(size);
		this.stack.push(5);
		this.stack.push(10);
	
		assertEquals("The peek is not correct", 10, this.stack.peek().intValue());
		assertEquals("The pop is not correct", 10, this.stack.pop().intValue());
		assertEquals("The peek is not correct", 5, this.stack.peek().intValue());
	}
	
	@Test
	public void testPeekNull() {
		try {
			this.stack.push(null);
			this.stack.peek().intValue();
			
			fail("peek null not working");
		}
		catch(Exception e) {
			assertEquals("Message is not null", null, e.getMessage());
		}
	}

}
