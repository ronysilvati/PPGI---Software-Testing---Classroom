package br.ufal.ic.testingtools.search;

import br.ufal.ic.testingtools.sort.QuickSort;

//For teaching purposes, this code is buggy
public class BinarySearch {
	
	public int binarySearch(int v[], int element) {
		 int begin = 0;
		 int end = v.length;
		 int middle;
		 new QuickSort().sort(v);

		 while (begin < end) {
			 middle = (begin + end) / 2;
		
			 if (v[middle] < element) {
				 begin = middle + 1;
			 } else if (v[middle] > element) {
				 end = middle - 1;
			 } else {
				 return v[middle];
			 }
		 }
		 return -1;
	}

}
