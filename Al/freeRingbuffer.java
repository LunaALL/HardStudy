package Algorithms;

import java.util.Scanner;

public class freeRingbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int max=5;
		int [] arr=new int[max];
		int num=0; //����
		
		Scanner sc =new Scanner(System.in);
		System.out.println("---------������ �Է��Ͻÿ�");
		int reply=0;
		do {
			System.out.printf("%2d��° �����Դϴ�.", (num+1) );
			
			arr[num++ %max]=sc.nextInt();
			System.out.println("����ұ�?? ��� 1 �ƴϸ� 0");
			reply=sc.nextInt();
			
			
		}while(reply==1);
		
		int i=num-max;
		if(i<0) i=0;
		
		for(; i<num; i++) {
			System.out.printf("%2d��°�� ����=%d\n",i+1,arr[i%max]);
		}

	}

}
