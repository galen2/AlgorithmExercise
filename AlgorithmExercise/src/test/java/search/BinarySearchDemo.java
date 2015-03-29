package search;

import org.junit.Test;

import util.BaseTest;

public class BinarySearchDemo extends BaseTest{
	
	@Test
	public void binarySearchRun(){
		int [] table = {1,2,3,4,5,6};
		int index = BinarySearch.binarySearch(table, 3);
		System.out.println(index);
	}

}
