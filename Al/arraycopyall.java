package Algo;

public class arraycopyall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {6,2,62,5,20,6,9,4,5,10};
		int [] arr2=new int[10];
		
		
		rcopy(arr2,arr);
		
		for(int e: arr2) {
			System.out.print(e+"|");
		}
		
	
	}
	
	static void copy(int[]a , int[]b) {
		
		for(int i=0; i<b.length;i++) {
			a[i]=b[i];
		}
		System.out.println("배열 복사 완료");
		
	}
	
	static void rcopy(int[]a, int[]b) {
		int j=b.length-1;
		
		
		for(int i=0; i<b.length; i++) {
			a[i]=b[j];
			j--;
			
		}
		
		System.out.println("거꾸로 배열 복사완료");
	}

}
