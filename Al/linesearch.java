package Month05;

public class linesearch {
	
	static void Quicksort(int[] arr) {
		Quicksort(arr,0,arr.length-1);
	}
	static void Quicksort(int[] arr, int start, int end) {
		int part=pattion(arr,start,end);
		if(start<part-1) {
			Quicksort(arr,start,part-1);
		}
		if(part<end) {
			Quicksort(arr,part,end);
		}
		
	}

	private static int pattion(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=arr[(start+end)/2];
		while(start<=end) {
			while(arr[start]<pivot) start++;
			while(pivot<arr[end]) end--;
			if(start<=end) {
				swap(arr,start,end);
				start++;
				end--;
			}
			
		}
		return start;
	}
	
	
	static void swap(int[] arr, int first, int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,5,7,7,13,19,20,30,22,18};
		int[] find=new int[8];
		
		System.out.println("중복값 =" +searchIdx(arr,arr.length,20,find)+ " 개 발견");
		
		for(int e: find) {
			if(e>0) {
				System.out.print("배열 idx["+(e-1)+"] 위치");
			}
			
		}
		Quicksort(arr);
		
		for(int e: arr) {
				System.out.print(e+"|");	
			
		}
		
	}
	
	static int searchIdx(int[] a, int n ,int key, int[] idx) {
		int count=0;
		
		for(int i=0; i<n;i++) {
			if(a[i]==key) {
				System.out.println("a["+i+"] 발견완료");
				idx[count]=i+1;
				count++;
			}
			
			
		}
		
		return count;
		
	}

}
