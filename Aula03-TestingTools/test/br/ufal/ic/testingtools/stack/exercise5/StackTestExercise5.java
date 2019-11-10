package br.ufal.ic.testingtools.stack.exercise5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.is;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.ufal.ic.testingtools.stack.DesktopTests;
import br.ufal.ic.testingtools.stack.MainFrameTests;
import br.ufal.ic.testingtools.stack.Stack;

@Category({DesktopTests.class, MainFrameTests.class})
public class StackTestExercise5 {
	
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
		assertTrue("The initial stack is not empty", stack.empty());
	}
	
	@Test
	public void testPush() {
		this.stack.push(90);
		this.stack.push(22);
		this.stack.push(18);
		assertThat(this.stack.pop().intValue(), is(18));
		assertThat(this.stack.pop().intValue(), is(22));
		assertThat(this.stack.pop().intValue(), is(90));
	}
	
	@Test
	public void testPushNull() {
		this.stack.push(null);
		
		assertTrue((null == this.stack.pop()));
	}
	
	@Test
	public void testPop() {
		this.size = 3;
		this.stack = new Stack<Integer>(this.size);
		this.stack.push(5);
		this.stack.push(10);
		this.stack.push(15);
		
		assertThat(this.stack.pop().intValue(), is(15));
		assertThat(this.stack.pop().intValue(), is(10));
		assertThat(this.stack.pop().intValue(), is(5));
		
	}
	
	@Test
	public void testPeek() {
		this.size = 2;
		this.stack = new Stack<Integer>(size);
		this.stack.push(5);
		this.stack.push(10);
	
		assertThat(this.stack.peek().intValue(), is(10));
		assertThat(this.stack.pop().intValue(), is(10));
		assertThat(this.stack.peek().intValue(), is(5));
	}
	
	@Test
	public void testPeekNull() {
		try {
			this.stack.push(null);
			this.stack.peek().intValue();
			
			fail("peek null not working");
		}
		catch(Exception e) {
			assertTrue("The exception message is not null",(null == e.getMessage()));
		}
	}

}
