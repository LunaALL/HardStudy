import java.util.NoSuchElementException;

class Queue {
	class node{
		private node next;
		private int item;
		
		public node (int n) {
			this.item=n;
		}
	}
	private node last; //µé
	private node first; //³ª°¡
	
	public void add(int n) {
		node nd= new node(n);
		if(last!=null) {
			last.next=nd;
		}
		last=nd;
		if(first==null) {
			first=last;
		}
	}
	
	public int Remove() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		
		int item=first.item;
		first=first.next;
		if(first ==null) {
			last=null;
		}
		return item;
	}
}




public class Queuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue Qe=new Queue();
		Qe.add(10);
		Qe.add(20);
		Qe.add(30);
		Qe.add(40);
		
		System.out.println(Qe.Remove());
		System.out.println(Qe.Remove());
		System.out.println(Qe.Remove());


	}

}
