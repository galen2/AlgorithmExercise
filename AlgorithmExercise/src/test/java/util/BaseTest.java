package util;

import java.util.Collection;

public class BaseTest {

	public void printData(Object obj){
		System.out.println("begin===========");
		if(obj instanceof Collection){
			printCollection((Collection)obj);
		}else if(obj.getClass().isArray()){
			printArray((Object[])obj);
		}else{
			print(obj);
		}
		System.out.println("  end ============");
	}
	
	
	private void printCollection(Collection obj){
		for(Object one : obj){
			print(one);
		}
	}
	
	private void printArray(Object[] obj){
		for(Object one : obj){
			print(one);
		}
	}
	
	private void print(Object data){
		System.out.print(data);
	}
	
	public  int[]  random(int n){
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
