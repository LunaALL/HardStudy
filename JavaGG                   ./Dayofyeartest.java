package Algo;

import java.util.Scanner;

public class Dayofyeartest {
	// 각 달의 일 수
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
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
		  // 윤년이 1일때 366일	
			System.out.print("윤년이며 ~~ ");
			return 366-a;
		}else
			System.out.println("평년이며~~ ");
			return 365-a;
		
	}
	
	


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // 한 번더 ?

		System.out.println("연내의 경과 일 수를 구합니다.");

		do {
			System.out.print("년：");
			int year = stdIn.nextInt(); // 년
			System.out.print("월：");
			int month = stdIn.nextInt(); // 월
			System.out.print("일：");
			int day = stdIn.nextInt(); // 일

			System.out.printf("연내 %d일째입니다.\n", dayofyear(year, month, day));
			
			System.out.println("해의 남은 일수는 " +leftdayofyear(year,month,day));

			System.out.print("한번 더 할까요? (1.예/0.아니오)：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
