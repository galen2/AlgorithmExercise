package programBeauty;

import org.junit.Test;

public class PhoneNumTest {

	@Test
	public void test(){
//		int[] number={2,6,6,7,8,8,3,7};
		int[] number={2,2};
		int len = number.length;
		int[] answer=new int[len];
		PhoneNum.RecursiveSearch(number,answer,0,len);
	}
}
