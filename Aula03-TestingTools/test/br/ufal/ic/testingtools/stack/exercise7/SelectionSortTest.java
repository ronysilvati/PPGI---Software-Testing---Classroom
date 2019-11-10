package br.ufal.ic.testingtools.stack.exercise7;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.ufal.ic.testingtools.search.BinarySearch;
import br.ufal.ic.testingtools.sort.SelectionSort;

public class SelectionSortTest {
	
	int elementsSize = 5;
	int[] elements = null;
	SelectionSort s = new SelectionSort();
	
	
	@Before
	public void beforeTest() {
		elements = new int[elementsSize];
		elements[0] = 140;
		elements[1] = 6;
		elements[2] = 100833;
		elements[3] = 78;
		elements[4] = 8408;
	}
	
	@Test
	public void testGeneralSort() {
		// 6 78 140 8408 100833
		s.sort(elements);
		
		for(int i = 0; i < elements.length - 1; i++) {
			assertTrue("First value is not smaller that next value",(elements[i] < elements[i] + 1));
		}
		
	}
	
	@Test
	public void testSortFirst() {
		// 6 78 140 8408 100833
		s.sort(elements);
		
		assertThat(elements[0], is(6));
	}
	
	@Test
	public void testSortLast() {
		
		// 6 78 140 8408 100833
		s.sort(elements);
		
		assertThat(elements[4], is(100833));
	}
	
	@Test
	public void testSortWithNegative() {
		
		elements = new int[elementsSize];
		elements[0] = 140;
		elements[1] = 6;
		elements[2] = -500;
		elements[3] = 78;
		elements[4] = 8408;
		
		// -500 6 78 140 8408
		s.sort(elements);
		
		assertThat(elements[0], is(-500));
	}
}
