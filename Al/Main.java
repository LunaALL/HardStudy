package Algo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
               /*
		Scanner sc =new Scanner(System.in);
	    float n;
	    n=sc.nextFloat();
	    System.out.printf("%.3f",n);
	    */
		
		//input 3:17 -> output 3:17
		//System.out.println(sc.nextLine());
		
		
		/*
		
		StringBuilder sb= new StringBuilder();
		sb.append(sc.nextLine());
		sb.delete(6, 7);
		System.out.println(sb);
	  */
		/*
		System.out.println(sc.nextLine());
		*/
		
		
		//�ܾ��� ����(����)�� �ϳ��� ������ �� �ٿ� �� ' '�� ��� ����Ѵ�.
		
		String Character=sc.nextLine();
		int n=Character.length();
		int a=0;
		while(a<n) {
			
			System.out.println("'"+Character.charAt(a)+"'");
			a++;
		}
	    
	}

}

