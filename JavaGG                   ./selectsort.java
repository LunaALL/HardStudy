
public class selectsort {
   
	/*private static void selectSort(int[] arr) {
    	selectSort(arr, 0);
    }
 
	private static void selectSort(int[] arr, int start) {
		// TODO Auto-generated method stub
		if(start<arr.length-1) {
			int Min=start;
			for(int i=start; i<arr.length ; i++) {
				if(arr[i]<arr[Min]) Min=i;
			}
			Swap(arr,start,Min);
			selectSort(arr,start+1);
			
		}
		
		
	}
	*/
	private static void Swap(int [] arr, int s, int e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
	}
	
	
	private static void Selectsort(int [] arr) {
		Selectsort(arr, 0);
	}
	
	private static void Selectsort(int[] arr, int start) {
		if(start<arr.length-1) {
			int min = start;
			for(int i=start; i<arr.length ; i++) {
				if(arr[i]<arr[min]) min=i;
				
			}
			Swap(arr,start,min);
			Selectsort(arr,start+1);
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,9,1,2,6,3,7,1,3};
		Selectsort(arr);
	 for(int e : arr) {
		 System.out.println(e);
	 }

	}

}
