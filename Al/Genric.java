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
		return que[front]; //선입해와서 출구로 대기하는 데이터 
		
	}
	
	public int indexof(E x) {
		for(int i=0; i<max ;i++) {
			int idx= (i+front) % max;   //front가 출구 rear 가 입구 . 
			
			//max를 이용해 나머지를 구하는 이유는 링버퍼는 프론트값이 맥스값에 근접하면 arr[0]부터 삽입을 다시하기때문임. 
			if(que[idx] == x)
				return idx; //위치를 반환한다.
		
		}
		return -1; //못찾았다.
		
	}
	
	public void clear() {
		num= front = rear=0;
	}
	public int maxsize() {
		return max;
	}
	
	
	
	
	

}
