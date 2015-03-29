import org.junit.Test;


public class client {

	@Test
	public void run(){
		int [] data = {1,2,3};
		int c = data[0];
		data[0]=5;
		System.out.println(c);
	}
}
