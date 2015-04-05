package stringopera;

import org.junit.Test;

import sringopera.StringReverse;
import util.BaseTest;

public class StringReverseTest extends BaseTest{

	@Test
	public void swapDemo(){
		char[] source = {'a','b','c','d'};
		StringReverse.swap(source, 0, source.length-1);
		System.out.println(source);
	}
	
	@Test
	public void reverse2Demo(){
		String sourse = "i am a student";
		char[] charArray = sourse.toCharArray();
		StringReverse.swap2(charArray,0,sourse.length()-1);
		printData(charArray);
	}
	
	
	@Test
	public void clinet(){
		StringReverseTest t = new StringReverseTest();
		System.out.println(t);
	}
	
}
