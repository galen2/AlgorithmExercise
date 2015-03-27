package sringopera;

import java.util.Stack;

public class StringReverse {

	public static void swap(char[] arg,int begin,int end){
		while(begin < end){
			char temp = arg[begin];
			arg[begin] = arg[end];
			arg[end] = temp;
			begin++;
			end--;
		}
	}
	


	/**
	 * 两两相互异或，只有两个比较位不同的时则为1，相同则为0
	 */
	public static void swap2( char[] str,int begin,int end) {
		  while (begin < end) {
		   str[begin] = (char) (str[begin] ^ str[end]);
		   str[end] = (char) (str[begin] ^ str[end]);
		   str[begin] = (char) (str[end] ^ str[begin]);
		   begin++;
		   end--;
		  }
	 }
	 
	 
	public static String reverse1(String str){
		int length = str.length();
		String reverse = "";
		for(int i = 0 ; i <length; i ++){
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	
	 
	 public static String reverse3(String s) {
		  char[] str = s.toCharArray();
		  Stack<Character> stack = new Stack<Character>();
		  for (int i = 0; i < str.length; i++)
		   stack.push(str[i]);
		  String reversed = "";
		  for (int i = 0; i < str.length; i++)
		   reversed += stack.pop();
		  
		  return reversed;
		 }
	 
	 
	
	public static void swapWords(String str){
		char[] arr = str.toCharArray();
		
		swap(arr, 0, arr.length-1);
		
		
		
	}
}
