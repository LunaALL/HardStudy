package Algorithms;

import java.util.Scanner;

public class Gausesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("n 까지 입력 ");
		n=sc.nextInt();
		
		System.out.println(GauseSum(n) );
		
		n=sc.nextInt();
		int a=sc.nextInt();
		
		System.out.println(" n ~ a 합 = "+ sumof(n,a));
		
		
		
	}
	private static void sumin(int n) {
	    int i=1;
	    int sum=0;
		while(i<=n) {
			if(i==n) {
				sum+=i;
				System.out.printf("%d= %d",i,sum);
				return;
			}
			sum+=i;
			System.out.printf("%d+",i);
			i++;
		}
		
	}
	
	private static int GauseSum(int n) {
		int sum= (1+n)*(n/2);
		
		return sum;
		
	}
	
	private static int sumof(int start, int end) {
		int sum=0;
		for(int i=start ; i<end ; i++) {
			sum +=i;
			
		}
		
		return sum;
		
	}

}
