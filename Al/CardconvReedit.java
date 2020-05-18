package Algo;

import java.util.Scanner;

public class CardconvReedit {

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
		
		StringBuilder sb= new StringBuilder();
		for(int i=num; i<32; i++ ) {
			sb.append(arr[i]);
			
		}
		String number=sb.toString();
		System.out.println(n+"진수로 "+number+" 입니다");
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
		
		String dchar="0123456789ABCDEFGH";
		
		int digit=d.length-1;
		System.out.printf("%3d",r);
		System.out.printf("| %3d\n",x);
		
do {		
	        System.out.printf("--------------\n");
			d[digit]=dchar.charAt((x%r));
			x=x/r;
			if(x==0) {
				System.out.printf("   | %3d",x);
				System.out.printf(" → %c\n",d[digit]);
				break;
			}
			
			System.out.printf("%3d",r);
			System.out.printf("| %3d",x);
			System.out.printf(" → %c\n",d[digit]);
			digit--;
			
			
		}while(x!=0);
		
		
		
		return digit;
		
		
	}
	
}
