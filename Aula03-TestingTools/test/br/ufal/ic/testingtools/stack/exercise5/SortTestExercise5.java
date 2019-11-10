package br.ufal.ic.testingtools.stack.exercise5;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import br.ufal.ic.testingtools.sort.BubbleSort;
import br.ufal.ic.testingtools.sort.QuickSort;
import br.ufal.ic.testingtools.sort.Sort;

public class SortTestExercise5 {
	//@Test(timeout=1000)
	public void testSortWithBubbleSort() {
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
	
	@Test(timeout=1000)
	public void testSortWithQuickSort() {
		final int elementsSize = 1000000; 
		int[] elements = new int[elementsSize];
		Random generator = new Random();
		Sort sortTest = new QuickSort();
		
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = generator.nextInt();
		}
		
		sortTest.sort(elements);
		
		for (int i = 0; i < elements.length - 1; ++i) {
			assertTrue("Element is not smaller", elements[i] <= elements[i + 1]);
		}
		
	}
	
	@Test
	public void testGeneralSort() {
		final int elementsSize = 5;
		int[] elements = new int[elementsSize];
		Sort sortTest = new BubbleSort();
		
		elements[0]	= 33;
		elements[1]	= 12;
		elements[2]	= 35;
		elements[3]	= 1450;
		elements[4]	= 87;
		
		sortTest.sort(elements);
		
		assertTrue("The first position is not correctly sort",(elements[0] == 12));
		assertTrue("The middle position is not correctly sort",(elements[2] == 35));
		assertTrue("The last position is not correctly sort",(elements[4] == 1450));
		
		for(int i = 0; i < elements.length - 1; i++) {
			assertTrue("Element is not smaller", elements[i] <= elements[i + 1]);
		}
	
	}
	
	@Test
	public void testLeftPart() {
		final int elementsSize = 100; 
		int[] elements = new int[elementsSize];
		Random generator = new Random();
		Sort sortTest = new BubbleSort();
		
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = generator.nextInt();
		}
		
		sortTest.sort(elements);

		for (int i = 0; i < 49; ++i) {
			assertTrue("On left part, element is not smaller", elements[i] <= elements[i + 1]);
			
			for(int y = 50; y <= 99; y++) {
				assertTrue("On left part, verifying Right part, element is not smaller", elements[i] <= elements[y]);
			}
			
		}
	}
	
	
	@Test
	public void testRightPart() {
		final int elementsSize = 100; 
		int[] elements = new int[elementsSize];
		Random generator = new Random();
		Sort sortTest = new BubbleSort();
		
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = generator.nextInt();
		}
		
		sortTest.sort(elements);

		for (int i = 49; i < 99; ++i) {
		
			assertTrue("On right part, element is not smaller", elements[i] <= elements[i + 1]);
			
			for(int y = 0; y < 49; y++) {
				assertTrue("On right part, verifying Left part, element is not greant", elements[i] >= elements[y]);
			}	
		}
	}

}
