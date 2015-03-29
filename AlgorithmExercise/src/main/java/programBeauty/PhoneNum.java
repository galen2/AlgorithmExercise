package programBeauty;

public class PhoneNum {
	

	public static void RecursiveSearch(int[] number,int[] answer,int index,int n){
		//index说明电话对电话号码第几位进行循环
		//n为电话号码位数
		char[][]  c={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
		int[] total = {0,0,3,3,3,3,3,4,3,4};
		if(index == n){
			for(int i = 0;i<n;i++){
				System.out.print(c[number[i]][answer[i]]);
				
			}
			System.out.print(";");
			return;
		}
		for(answer[index] = 0;answer[index]<total[number[index]];answer[index]++){
			RecursiveSearch(number,answer,index+1,n);
		}
	}
}
