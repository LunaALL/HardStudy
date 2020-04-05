import java.util.EmptyStackException;



class stack{
	class node{
		private node next;
		private int item;
		public node (int item) {
			this.item=item;
		}
		}
	private node Top;
	
	public void push(int n) {
		node n1= new node(n);
		n1.next=Top;
		Top=n1;
	}
	
	public int pop() {
		if(Top==null) {
			throw new EmptyStackException();
		}
		int item=Top.item;
		Top= Top.next;
		return item;
		
	}
	
	public boolean isEmpty() {
		return Top==null;
	}
	
	
	
}

public class Stacktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st = new stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		
		

	}

}

