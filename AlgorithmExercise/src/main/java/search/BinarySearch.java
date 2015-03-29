package search;

/**
 *  折半查找(二分查找)
 * @author Admin
 *
 */
public class BinarySearch {
	
	public static int binarySearch(int []table,int cobj){
		return binarySearch(table, cobj, 0, table.length-1);
	}
	
	public static int binarySearch(int [] table,int cobj,int low,int high){
		if(table !=null){
			while(low <= high){
				int mid = (low+high)/2;
				if(table[mid]==cobj){
					return mid;
				}
				if(table[mid]>cobj){
					low = mid+1;
				}else{
					high = mid-1;
				}
			}
		}
		return -1;
	}
}
