package Algo;

import java.util.Scanner;

public class narciss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=narciss(n);
		if(a==1) {
			System.out.println("이 수는 자아 도취수입니다..."+n+"-> narcissistic number");
		}
		
	
	}
	
	private static int narciss(int n) {
		int num_size=1; //자릿수 계산 변수
		int num_save=n;
		while(true) { //자릿수 계산영역
			n=n/10;
			num_size++;
			if(n==1) {
				break;	
			}	
		}
		double sum=0; //더한값 저장;
		int moc=0; //현재 번호들을 한자리 수씩 변환해 저장하는 함수
		double temp=num_save;; //원래 값을 저장 
		
		for(int i=1; i<=num_size ;i++) {
			moc=num_save%10;
			num_save/=10;
			sum+=Math.pow(moc, num_size);
			System.out.println("sum값 ="+sum);
			}
		
		if(temp==sum) {
			return 1;
		} else {
			System.out.println("자아 도취수가 아니네요.껄껄");	
		}
		
	
		return 0;
	}

}
