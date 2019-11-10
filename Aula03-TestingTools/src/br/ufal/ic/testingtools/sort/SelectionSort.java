package br.ufal.ic.testingtools.sort;

//For teaching purposes, this code is buggy (swap)
public class SelectionSort implements Sort {

	public void sort(int[] array) {
		for (int fixed = 0; fixed < array.length - 1; fixed++) {
			int min = fixed;
			
			for (int i = min + 1; i < array.length; i++) {
				
				if (array[i] < array[min]) {
					min = i;
				}
			}
			if (min != fixed) {
				swap(array, fixed, min);
			}
		}
	}
	
	private void swap(int[] elements, int indexElement1, int indexElement2) {
		int temp = elements[indexElement1];
		elements[indexElement1] = elements[indexElement2];
		elements[indexElement2] = temp;
	}

}
