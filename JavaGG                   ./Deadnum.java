package Algorithms;

import java.util.Scanner;

public class Deadnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int a=0;
		a=sc.nextInt();
		Numindex(a);
		/*
		do {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>=b) {
				System.out.println("a보다 큰 값 입력");
			}
		} while(a>=b);
		System.out.println(b-a);
		*/
	}
	
	private static void Numindex(int n) {
		int moc=0;
		int namuji=1;
		while(true) {
			moc=n/10;
			n=n/10;
			namuji++;
			if(moc<10) {
				System.out.println(namuji + "자리 숫자입니다.");
				break;
			}
			
		}
		
	}
	

}
