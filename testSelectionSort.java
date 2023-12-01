package Lab10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testSelectionSort {
	selectionSort array = new selectionSort();
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
	public testSelectionSort() {
	}
	
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 2;
		arr[3] = 8;
		arr[4] = 6;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 3;
		Sortedarr[2] = 5;
		Sortedarr[3] = 6;
		Sortedarr[4] = 8;
		
		int[] actualSortarr = array.basicSelectionSort(arr);
		
		assertArrayEquals(Sortedarr, actualSortarr);
	/** add tests to check for this unit test **/
		arr[0] = 3;
		arr[1] = 7;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 8;
		
		Sortedarr[0] = 1;
		Sortedarr[1] = 2;
		Sortedarr[2] = 3;
		Sortedarr[3] = 7;
		Sortedarr[4] = 8;
		
		actualSortarr = array.basicSelectionSort(arr);
		
		assertArrayEquals(Sortedarr, actualSortarr);
	}
	
	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -6;
		arr[1] = -3;
		arr[2] = -8;
		arr[3] = -1;
		arr[4] = -7;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = -7;
		Sortedarr[2] = -6;
		Sortedarr[3] = -3;
		Sortedarr[4] = -1;
		
		int[] actualSortarr = array.basicSelectionSort(arr);
		
		assertArrayEquals(Sortedarr, actualSortarr);
	/** Test data contains negative values only **/
	}
	
	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = -5;
		arr[2] = 0;
		arr[3] = 1;
		arr[4] = -7;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -7;
		Sortedarr[1] = -5;
		Sortedarr[2] = 0;
		Sortedarr[3] = 1;
		Sortedarr[4] = 3;
		
		int[] actualSortarr = array.basicSelectionSort(arr);
		
		assertArrayEquals(Sortedarr, actualSortarr);
	/** Test data contains with both positive, negative and zeros **/
	}
	
	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 4;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 2;
		Sortedarr[2] = 3;
		Sortedarr[3] = 3;
		Sortedarr[4] = 4;
		
		int[] actualSortarr = array.basicSelectionSort(arr);
		
		assertArrayEquals(Sortedarr, actualSortarr);
	/** Test data contains duplicates **/
	}
}
