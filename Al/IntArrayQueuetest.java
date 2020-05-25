package Month05;

import java.util.Scanner;

public class IntArrayQueuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrayQueue queue1= new IntArrayQueue(8);
		Scanner sc =new Scanner(System.in);
		int x=0;
		while(true) {
			System.out.print("���� ������ ���� "+ queue1.insize() +" / "+ queue1.maxsize() );
			System.out.print("\n(0)���� (1)��ť (2)��ť (3)��ũ (4)������Ʈ");
			int menu=sc.nextInt();
			if(menu==0) {
				break;
			}
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x=sc.nextInt();
				try {
					queue1.enqueue(x);
				}catch (IntArrayQueue.Overflow e) {
					System.out.println("ť�� �Ѱ���");
				}
				break;
			case 2:
				x=queue1.dequeue();
				try {
					System.out.println("��ť�� �����ʹ� "+x+" ��");	
				} catch(IntArrayQueue.EmptyQueue e){
					System.out.println("ť�� ������ϴ�.");
				}
				
				break;
			case 3:
				try {
					x=queue1.peek();
					System.out.println("���� front�� ����Ű�� ���� "+x+"�ӵ�");
				}catch(IntArrayQueue.EmptyQueue e) {
					System.out.println("�����ð� ����");
				}
				break;
			case 4:
				queue1.dump();
				break;
				
			}
			
			
		}
		
		
	}

}
