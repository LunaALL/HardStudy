package Algo;

import java.util.Scanner;
class Median{
	public static int med3(int a, int b , int c) {
		
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if (a<=c) {
				return a;
			}else return c;
			}
		else if(a>c){
			return a;
		}
		else if(b>c) {
			return c;
		}
		else 
			return b;
		
	}
	
	
	
}



public class MiddlenumAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner sc= new Scanner(System.in);	
	 System.out.println("a의 값 입력");
	 int a=sc.nextInt();
	 
	 System.out.println("b의 값 입력");
	 int b=sc.nextInt();
	 
	 System.out.println("c의 값 입력");
	 int c=sc.nextInt();
	 
	 System.out.println("중앙값은 "+ Median.med3(a, b, c));
	
	}

}
