package br.ufal.ic.testingtools.stack.exercise7;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import br.ufal.ic.testingtools.search.BinarySearch;

public class BinarySearchTest {
	
	int elementsSize = 5;
	int[] elements = null;
	BinarySearch b = new BinarySearch();
	
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
	public void testSearchMiddle() {
		// 6 78 140 8408 100833
			
		assertThat(b.binarySearch(elements, 140), is(140));
	}
	
	@Test
	public void testSearchBoundaryTop() {
		// 6 78 140 8408 100833
			
		assertThat(b.binarySearch(elements, 100833), is(100833));
	}
	
	@Test
	public void testSearchBoundaryDown() {
		// 6 78 140 8408 100833
			
		assertThat(b.binarySearch(elements, 6), is(6));
	}
}
