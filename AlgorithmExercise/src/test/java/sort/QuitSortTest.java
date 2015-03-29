package sort;

import org.junit.Test;

import util.BaseTest;

public class QuitSortTest extends BaseTest{
	
	@Test
	public void quirtSort(){
		int[] table = random(5);
		QuitSort.quirtSort(table);
		printData(table);
	}
	
}
