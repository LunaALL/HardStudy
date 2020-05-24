package Month05;

import java.util.Scanner;

public class Gstacktestcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("스택 사이즈를 입력");
		int max=sc.nextInt();
		

		Gstack<Integer> stack1 =new Gstack<Integer>(max);

		while (true) {
			System.out.println("현재 데이터 수：" + stack1.size() + " / " + stack1.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
								  "(4)덤프 (5)초기화 (6)비었는지 확인 (7)만땅알림 (8)스택사이즈확인　(0)종료：");
	

			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// 푸시
				System.out.print("데이터：");
				x = sc.nextInt();
				try {
					stack1.push(x);
			 	} catch (Gstack.OverflowGstackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							// 팝
				try {
			 		x = stack1.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (Gstack.EmptyGstackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							
				try {
			 		x = stack1.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (Gstack.EmptyGstackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 프린트
				stack1.printall();
				break;
			 case 5:
				 System.out.println("초기화 완료");
				stack1.clear();
				break;
			 case 6: 							
				System.out.println(stack1.isEmpty());
				break;
			 case 7:
				 System.out.println(stack1.isFull() );
				 break;
			 case 8:
				 System.out.println("현재 사이즈는 ="+stack1.size( ));
				 break;
			
			}
		}
	}
	

}
