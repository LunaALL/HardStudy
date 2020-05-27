package Month05;

import java.lang.reflect.Array;


public class Genric <E> {
	private int max;
	private int num;
	private int front;
	private int rear;
	private E[] que;
	
	
	public Genric(Class<E> cla, int max) {
		this.max=max;
		num=front=rear=0;
		
		try {
			
			que=(E[])Array.newInstance(cla, max);
		}catch(OutOfMemoryError e) {
			max=0;
		}
		
	}
	
	public static class EmptyExceptionG extends RuntimeException{
		public EmptyExceptionG() {};
	}
	public static class OverflowExceptionG extends RuntimeException{
		public OverflowExceptionG () {};
	}
	
	public void Inqueue(E x) throws OverflowExceptionG {
		if(num>=max) {
			throw new OverflowExceptionG();
		}
		que[rear++]=x;
		num++;
		if(rear==max) {
			rear=0;
		}
		
	}
	
	public E dequeue() throws EmptyExceptionG{
		if(num<=0) {
			throw new EmptyExceptionG();
		}
		E x=que[front++];
		if(front==max) {
			front=0;
		}
		
		
		return x;
		
	}
	
	public E peek() throws EmptyExceptionG{
		if(num<=0) {
			throw new EmptyExceptionG();
		}
		return que[front]; //�����ؿͼ� �ⱸ�� ����ϴ� ������ 
		
	}
	
	public int indexof(E x) {
		for(int i=0; i<max ;i++) {
			int idx= (i+front) % max;   //front�� �ⱸ rear �� �Ա� . 
			
			//max�� �̿��� �������� ���ϴ� ������ �����۴� ����Ʈ���� �ƽ����� �����ϸ� arr[0]���� ������ �ٽ��ϱ⶧����. 
			if(que[idx] == x)
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
	
	
	
	
	

}
