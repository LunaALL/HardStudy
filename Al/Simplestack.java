package Algorithms;

import java.util.Scanner;

public class Simplestack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		intstack s  = new intstack(64);	// 최대 64개를 푸시할 수 있는 스택

		while (true) {
			
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
								  "(4)덤프　(0)종료：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// 푸시
				System.out.print("데이터：");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (intstack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							// 팝
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (intstack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							// 피크
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (intstack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 덤프
				s.allprint();
				break;
			}

	}
	}

}
