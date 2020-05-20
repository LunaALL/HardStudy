package Month05;

import java.util.Scanner;

public class BinSearch1 {
	static int binsearch(int[] arr, int n , int key) {
		int first=0;  //처음
		int last=n-1; //끝
		do {
			int pc= (first+last)/2; //중간값 찾기
			if(arr[pc]==key)
				return pc;
			else if(arr[pc]<key) {
				first=pc+1;  //키가 중간값보다 크니 오른쪽 파티션 
			}else {  //키보다 중간값이 큰경우니 왼쪽파티션에서 계산
			    last=pc-1;
			}
		}while(first<=last); //
	
		
		return -1; //실패
	}
	
	
	static void bubblesort(int[] arr, int last) {
		if(last>0) {
			for(int i=1 ; i<=last ; i++) {
				if(arr[i]<arr[i-1]) {
					swap(arr,i,i-1);
				}
			}
			bubblesort(arr,last-1);
		}
		
	}
	static void swap(int[] arr, int first, int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC= new Scanner(System.in);
		
		
		
		System.out.print("요솟수 입력 : ");
		int num=SC.nextInt();
		int[] arr = new int[num];
		
		System.out.println("원하는 숫자 마구잡이 입력");
		
		for(int i=0; i<num;i++) {
			
			System.out.print("x["+i+"] :");
			arr[i]=SC.nextInt();
			if(i>0) {
				if(arr[i-1]==arr[i]) {
					System.out.println("중복값 발견 다시하셈");
					return;
				}
			}
			
			
		}
		int [] arr2= {6,5,2,10,58,54,32,28,14};
		
		
		bubblesort(arr, arr.length-1);
		System.out.println("정렬하겠슴돠");
		for(int e : arr) {
			System.out.print(e+ "|");
		}
		

		System.out.print("\n검색할 값: ");
	
		int key=SC.nextInt();
		
		
		int Sec=binsearch(arr, arr.length , key);
		if(Sec==-1) {
			System.out.println("아무리 찾아봐도 없었다고 한다....");
		}else
			System.out.println("arr ["+(Sec+1)+"] 에서 찾았소");
		
		

	

	}
}
