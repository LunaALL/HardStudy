package Month05;

public class Genricqueuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Genric<Integer> ge = new Genric<Integer>(Integer.class, 10);  //�����ϴ� Ÿ�� Ŭ�������� �Ѱ��ش�. 
		
		ge.Inqueue(10);
		ge.Inqueue(20);
		ge.Inqueue(30);
		ge.Inqueue(40);
		
		System.out.println("��ť�߽��ϴ� = > "+ge.dequeue() );
		System.out.println("�� ��ġ~~"+ge.peek());
		System.out.println("��ť�߽��ϴ� = > "+ge.dequeue());
		System.out.println("30��ġ ? "+ge.indexof(30));
		
		
		
		
		

	}

}
