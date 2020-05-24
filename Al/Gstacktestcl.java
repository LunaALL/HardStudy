package Month05;

import java.util.Scanner;

public class Gstacktestcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("���� ����� �Է�");
		int max=sc.nextInt();
		

		Gstack<Integer> stack1 =new Gstack<Integer>(max);

		while (true) {
			System.out.println("���� ������ ����" + stack1.size() + " / " + stack1.capacity());
			System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��" +
								  "(4)���� (5)�ʱ�ȭ (6)������� Ȯ�� (7)�����˸� (8)���û�����Ȯ�Ρ�(0)���᣺");
	

			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// Ǫ��
				System.out.print("�����ͣ�");
				x = sc.nextInt();
				try {
					stack1.push(x);
			 	} catch (Gstack.OverflowGstackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			 case 2: 							// ��
				try {
			 		x = stack1.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (Gstack.EmptyGstackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 3: 							
				try {
			 		x = stack1.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (Gstack.EmptyGstackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 4: 							// ����Ʈ
				stack1.printall();
				break;
			 case 5:
				 System.out.println("�ʱ�ȭ �Ϸ�");
				stack1.clear();
				break;
			 case 6: 							
				System.out.println(stack1.isEmpty());
				break;
			 case 7:
				 System.out.println(stack1.isFull() );
				 break;
			 case 8:
				 System.out.println("���� ������� ="+stack1.size( ));
				 break;
			
			}
		}
	}
	

}
