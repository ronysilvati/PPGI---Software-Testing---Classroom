package br.ufal.ic.testingtools.sort;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import br.ufal.ic.testingtools.sort.BubbleSort;
import br.ufal.ic.testingtools.sort.Sort;

public class SortTest {

	@Test(timeout=1000)
	public void testSort() {
		final int elementsSize = 1000000; 
		int[] elements = new int[elementsSize];
		Random generator = new Random();
		Sort sortTest = new BubbleSort();
		
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = generator.nextInt();
		}
		
		sortTest.sort(elements);
		
		for (int i = 0; i < elements.length - 1; ++i) {
			assertTrue("Element is not smaller", elements[i] <= elements[i + 1]);
		}
		
	}
	
}
