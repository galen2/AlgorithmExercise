package util;

import java.lang.reflect.Array;

public class BaseTest {

	public void printData(Object obj){
		System.out.println("begin===========");
		System.out.println(obj);
		System.out.println("end ============");
	}
	
	public  int[] random(int n){
		if(n>0){
			int table[] = new int[n];
			for(int i =0;i<table.length;i++){
				table[i] = (int)(Math.random()*100);
			}
			return table;
		}
		return null;
	}
}
