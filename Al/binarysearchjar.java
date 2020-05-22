package Month05;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearchjar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner std= new Scanner(System.in);
		
		int[] arr= {1,3,5,8,11,32,34,40,54};
		
		System.out.print("찾을 값을 입력 : ");
		int key=std.nextInt();
		
		int idx =Arrays.binarySearch(arr, key);
		
		if(idx<0) {
			System.out.println("못 찾았다 아마 비슷한값은 여기? arr["+idx+"]");
			//삽입포인트 , 즉 배열내에서 key값보다 작은 범위를 -를 붙여 반환한다. a[0]이 포함되어 -1이 정확한 위치 
		}else {
			System.out.println("찾았다 위치는 arr["+idx+"]");
		}
	}

}

