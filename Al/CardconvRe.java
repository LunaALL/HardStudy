package Algo;

import java.util.Scanner;

public class CardconvRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//값이 역으로 들어감.
		int x=0 ; 
		int n=0; //진수
		
		Scanner sc =new Scanner(System.in);
		System.out.println("기수 입력");
		x=sc.nextInt();
		System.out.println("진수 입력");
		n=sc.nextInt();
		
		char[] arr= new char[32];
		
		/*
		int digi=CardConvR(x,n,arr);
		System.out.println(digi);
		
		for(char a : arr) {
			System.out.print(a+"|");
		}
		
		*/
		
		int num=CardConv(x,n,arr);
		
		for(int i=num; i<32; i++ ) {
			System.out.print(arr[i]+ "|");
			
			
		}
	
	}
	
	
	
	static int CardConvR(int x, int r, char[] d){
		int digit=0;
		String dchar="0123456789ABCDEFGH";
		
		do {
			d[digit]=dchar.charAt((x%r));
			digit++;
			x=x/r;
			
		} while(x!=0);
		
		return digit;
		
		
	}
	
	static int CardConv (int x, int r, char[] d) {
		System.out.println("\n하앙 기모찌 태윤짱");
		String dchar="0123456789ABCDEFGH";
		
		int digit=d.length-1;
		do {
			d[digit]=dchar.charAt((x%r));
			digit--;
			x=x/r;
			
		}while(x!=0);
		
		return digit;
		
		
	}
	
}
