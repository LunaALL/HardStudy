package Month05;

public class IntArrayQueue {
	private int front;
	private int rear;
	private int max;
	private int num;
	int [] arr; 
	//�� ���۸� �̿��� ��� ť ������ 
	
	public IntArrayQueue(int size) {
		front=rear=num=0;
		max=size;
		
		try {
			arr= new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	
	public class EmptyQueue extends RuntimeException{
		public EmptyQueue() {}
		//�������
	}
	
	public class Overflow extends RuntimeException {
		//�����϶�
		public Overflow () {}
	}
	
	
	public int enqueue(int x) throws Overflow {
		if(num>=max) {
			throw new Overflow();
		}
		arr[rear++]=x;
		num++; //Ƚ�� ������
		if(front==rear) {
			rear=0;
		}
		return x;
	
	}
	
	public int dequeue() throws EmptyQueue {
		if(num<=0) {
			throw new EmptyQueue();
		}
		int x= arr[front++];  //���� ����Ʈ�� ������Ŵ 
		num--;
		if(front==max) {
			front=0;
		}
		return x;
		
	}
	
	public int peek() throws EmptyQueue{
		if(num<=0) {
			throw new EmptyQueue();
		}
		return arr[front]; //�����ؿͼ� �ⱸ�� ����ϴ� ������ 
		
	}
	
	public int indexof(int x) {
		for(int i=0; i<max ;i++) {
			int idx= (i+front) % max;   //front�� �ⱸ rear �� �Ա� . 
			
			//max�� �̿��� �������� ���ϴ� ������ �����۴� ����Ʈ���� �ƽ����� �����ϸ� arr[0]���� ������ �ٽ��ϱ⶧����. 
			if(arr[idx] == x)
				return idx; //��ġ�� ��ȯ�Ѵ�.
		
		}
		return -1; //��ã�Ҵ�.
		
	}
	
	public void clear() {
		num= front = rear=0;
	}
	public int maxsize() {
		return max;
	}
	
	
	public int insize() {  //�󸶳� �׿���
		return num;
	}
	
	public boolean isEmpty() //�����
	{
		return num<=0;
	}
	
	public boolean isFull() 
	{
		return max<=num;
	}
	public void dump() {
		if(num<=0) {
			System.out.println("ť�� ������ϴ�.");
		}
		for(int i=0; i<num; i++) {
			System.out.print(arr[(front+i)%max]+"|");	
		}
		
		
	}
	
	
	
	

}
