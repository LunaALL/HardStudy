package Month05;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearchjar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner std= new Scanner(System.in);
		
		int[] arr= {1,3,5,8,11,32,34,40,54};
		
		System.out.print("ã�� ���� �Է� : ");
		int key=std.nextInt();
		
		int idx =Arrays.binarySearch(arr, key);
		
		if(idx<0) {
			System.out.println("�� ã�Ҵ� �Ƹ� ����Ѱ��� ����? arr["+idx+"]");
			//��������Ʈ , �� �迭������ key������ ���� ������ -�� �ٿ� ��ȯ�Ѵ�. a[0]�� ���ԵǾ� -1�� ��Ȯ�� ��ġ 
		}else {
			System.out.println("ã�Ҵ� ��ġ�� arr["+idx+"]");
		}
	}

}

