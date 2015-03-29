package sort;

/**
 * 快速排序
 * @author Admin
 *
 */
public class QuitSort {

	public static void quirtSort(int[] table){
		quirtSort(table, 0, table.length-1);
	}
	
	private static void quirtSort(int[] table,int low,int high){
		if(low < high){
			int i = low,j=high;
			int vot = table[i];
			while(i!=j){
				while(i < j && vot<table[j]){
					j--;
				} 
				if(i<j){
					table[i]=table[j];
					i++;
				}
				
				while(i<j && vot >table[i]){
					i++;
				}
				if(i<j){ 
					table[j] = table[i];
					j--;
				}
			}
			table[i] = vot;
			System.out.println(low+".."+high+",vot="+vot);
			quirtSort(table,low,j-1);
			quirtSort(table,i+1,high);
		}
		
		
		
	}
}
