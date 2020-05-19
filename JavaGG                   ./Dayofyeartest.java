package Algo;

import java.util.Scanner;

public class Dayofyeartest {
	// �� ���� �� ��
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
	};

	// ���� year���� �����ΰ�? (���⣺1����⣺0)
	static int isLeap(int year) {
		
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayofyear(int y, int m, int d) {
		int days=d;
		
		for(int i =1; i<m ; i++) {
			days += mdays[isLeap(y)][i-1];	
		}
		return days;
		
		
	}
	
	
	static int dayofyears(int y, int m , int d) {
		m=m-1;
		while(m--!=0) {
			d=d+mdays[isLeap(y)][m];
		}
		return d;
		
	}
	
	
	static int leftdayofyear(int y, int m ,int d) {
		int a=dayofyears(y,m,d);
		if(isLeap(y)==1) {
		  // ������ 1�϶� 366��	
			System.out.print("�����̸� ~~ ");
			return 366-a;
		}else
			System.out.println("����̸�~~ ");
			return 365-a;
		
	}
	
	


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // �� ���� ?

		System.out.println("������ ��� �� ���� ���մϴ�.");

		do {
			System.out.print("�⣺");
			int year = stdIn.nextInt(); // ��
			System.out.print("����");
			int month = stdIn.nextInt(); // ��
			System.out.print("�ϣ�");
			int day = stdIn.nextInt(); // ��

			System.out.printf("���� %d��°�Դϴ�.\n", dayofyear(year, month, day));
			
			System.out.println("���� ���� �ϼ��� " +leftdayofyear(year,month,day));

			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�)��");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
