package Month05;

public class IntArrayQueue {
	private int front;
	private int rear;
	private int max;
	private int num;
	int [] arr; 
	//링 버퍼를 이용한 어레이 큐 만들어보쟈 
	
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
		//비었을때
	}
	
	public class Overflow extends RuntimeException {
		//가득일때
		public Overflow () {}
	}
	
	
	public int enqueue(int x) throws Overflow {
		if(num>=max) {
			throw new Overflow();
		}
		arr[rear++]=x;
		num++; //횟수 포인터
		if(front==rear) {
			rear=0;
		}
		return x;
	
	}
	
	public int dequeue() throws EmptyQueue {
		if(num<=0) {
			throw new EmptyQueue();
		}
		int x= arr[front++];  //뺄때 프런트를 증가시킴 
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
		return arr[front]; //선입해와서 출구로 대기하는 데이터 
		
	}
	
	public int indexof(int x) {
		for(int i=0; i<max ;i++) {
			int idx= (i+front) % max;   //front가 출구 rear 가 입구 . 
			
			//max를 이용해 나머지를 구하는 이유는 링버퍼는 프론트값이 맥스값에 근접하면 arr[0]부터 삽입을 다시하기때문임. 
			if(arr[idx] == x)
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
	
	
	public int insize() {  //얼마나 쌓였니
		return num;
	}
	
	public boolean isEmpty() //비었냐
	{
		return num<=0;
	}
	
	public boolean isFull() 
	{
		return max<=num;
	}
	public void dump() {
		if(num<=0) {
			System.out.println("큐가 비었습니다.");
		}
		for(int i=0; i<num; i++) {
			System.out.print(arr[(front+i)%max]+"|");	
		}
		
		
	}
	
	
	
	

}
