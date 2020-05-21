package Month05;

import java.util.Scanner;

public class BinSearchEm {

	
	static int binsearch(int[] arr, int n , int key) {
		int first=0;  //처음
		int last=n-1; //끝
		System.out.print("  |");
		for(int i=0; i<n;i++) {
			System.out.printf("%2d ",i);
		}
		System.out.printf("\n--+--------------------------\n");
		System.out.print("  |");
		for(int e: arr) {
			System.out.printf("%2d ",e);
		}
		do {
			int pc= (first+last)/2; //중간값 찾기
			if(arr[pc]==key) {
				int Find=pc;
				while(Find>0) {
					Find--;
					if(arr[Find]==key) {
						System.out.println("같은거 찾았다!");
					}else {
						System.out.println("\n더이상 없다 끝낸다");
						return Find+1;
					}
				}
			}
				
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
		/*
		System.out.print("요솟수 입력 : ");
		int num=SC.nextInt();
		
		int[] arr = new int[num];
		int[] arr3 = new int[num]; //중복값 찾기용. 
		
		System.out.println("원하는 숫자 마구잡이 입력");
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"] :");
			arr[i]=SC.nextInt();
		}	
		
		bubblesort(arr, arr.length-1);
		System.out.println("정렬하겠슴돠");
		for(int e : arr) {
			System.out.print(e+ "|");
		}

		System.out.print("\n검색할 값: ");
		int key=SC.nextInt();
		*/
		
		int[] arr= {1,5,8,12,12,12,15,30,36};
		int key=12;
		
		
		
		
		int Sec=binsearch(arr, arr.length , key);
		if(Sec==-1) {
			System.out.println("아무리 찾아봐도 없었다고 한다....");
		}else
			System.out.print("중복값 첫번째 위치는 =");
			System.out.println("arr["+(Sec)+"]");

	}
}
