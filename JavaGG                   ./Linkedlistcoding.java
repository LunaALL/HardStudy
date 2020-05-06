package chp24;

class node {
	int data;
	node next=null;
	public node(int n) {
		this.data=n;
	}
	
	void append(int n) {
		node end = new node(n); //새로운 링크를 만들어야하는 노드
		node NodeMe = this; //헤더 노드 (맨앞) 
		while(NodeMe.next!=null) {
			NodeMe=NodeMe.next;
		}
		NodeMe.next=end; //맨끝에 붙여주는 작업
		}
	
	void delete (int n) {
		node NodeMe = this;
		while(NodeMe.next!=null) {
			if(NodeMe.next.data==n) {
				NodeMe.next=NodeMe.next.next; //다음노드 날라가고 그다음노드 들어옴.
			} else {
				NodeMe=NodeMe.next; //값이 다른경우에는 다른 노드를 찾음
			}
		}
	}
	
	void printAll() {
		node NodeMe=this;
		while(NodeMe.next!=null) {
			System.out.print(NodeMe.data+"->");
			NodeMe=NodeMe.next; //현재 노드미에 넥스트 넣음.
		}
		System.out.println(NodeMe.data);
	}
}
public class Linkedlistcoding {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  node Head = new node(1);
	  Head.append(2);
	  Head.append(3);
	  Head.append(4);

	  Head.printAll();
	  Head.delete(2);
	  Head.printAll();
	}

}
