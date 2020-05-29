package Algorithms;

import java.util.Scanner;

public class freeRingbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int max=5;
		int [] arr=new int[max];
		int num=0; //개수
		
		Scanner sc =new Scanner(System.in);
		System.out.println("---------정수를 입력하시오");
		int reply=0;
		do {
			System.out.printf("%2d번째 변수입니다.", (num+1) );
			
			arr[num++ %max]=sc.nextInt();
			System.out.println("계속할까?? 계속 1 아니면 0");
			reply=sc.nextInt();
			
			
		}while(reply==1);
		
		int i=num-max;
		if(i<0) i=0;
		
		for(; i<num; i++) {
			System.out.printf("%2d번째의 정수=%d\n",i+1,arr[i%max]);
		}

	}

}
