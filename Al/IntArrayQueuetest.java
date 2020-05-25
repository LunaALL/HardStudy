package Month05;

import java.util.Scanner;

public class IntArrayQueuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrayQueue queue1= new IntArrayQueue(8);
		Scanner sc =new Scanner(System.in);
		int x=0;
		while(true) {
			System.out.print("현재 데이터 수는 "+ queue1.insize() +" / "+ queue1.maxsize() );
			System.out.print("\n(0)종료 (1)인큐 (2)디큐 (3)피크 (4)올프린트");
			int menu=sc.nextInt();
			if(menu==0) {
				break;
			}
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x=sc.nextInt();
				try {
					queue1.enqueue(x);
				}catch (IntArrayQueue.Overflow e) {
					System.out.println("큐가 한가득");
				}
				break;
			case 2:
				x=queue1.dequeue();
				try {
					System.out.println("디큐한 데이터는 "+x+" 임");	
				} catch(IntArrayQueue.EmptyQueue e){
					System.out.println("큐가 비었습니다.");
				}
				
				break;
			case 3:
				try {
					x=queue1.peek();
					System.out.println("현재 front가 가리키는 값은 "+x+"임돠");
				}catch(IntArrayQueue.EmptyQueue e) {
					System.out.println("가져올게 읎다");
				}
				break;
			case 4:
				queue1.dump();
				break;
				
			}
			
			
		}
		
		
	}

}
