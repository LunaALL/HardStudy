package Month05;

public class Genricqueuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Genric<Integer> ge = new Genric<Integer>(Integer.class, 10);  //선언하는 타입 클래스까지 넘겨준다. 
		
		ge.Inqueue(10);
		ge.Inqueue(20);
		ge.Inqueue(30);
		ge.Inqueue(40);
		
		System.out.println("디큐했습니다 = > "+ge.dequeue() );
		System.out.println("픽 위치~~"+ge.peek());
		System.out.println("디큐했습니다 = > "+ge.dequeue());
		System.out.println("30위치 ? "+ge.indexof(30));
		
		
		
		
		

	}

}
