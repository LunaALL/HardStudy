





public class Qucitest {
	public static void QuickSort(int[] arr){
		QuickSort(arr, 0 , arr.length-1 );
	}

	public static void QuickSort(int[] arr, int Start, int End) {
		// TODO Auto-generated method stub
		int part=patti(arr,Start,End);
		if(Start<part-1) {
			QuickSort(arr,Start,part-1);
		}
		if(part<End) {
			QuickSort(arr,part,End);
		}
		
	}
	
	public static int patti(int[] arr, int Start, int End) {
		int pivot=arr[(Start+End)/2] ;
		while(Start<=End) {
			while(arr[Start]<pivot) Start++;
			while(pivot <arr[End]) End--;
			if(Start<=End) {
				swap(arr,Start,End);
				Start++;
				End--;
			}
		}
		
		return Start;
	}
	
	

	private static void swap(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int temp= arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,7,2,8,2,8,6,9,4};
	    QuickSort(arr);
		
		for(int a: arr) {
			System.out.print( a+ "|" );
		}
		

	}

}
