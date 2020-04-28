package chp24;

class node {
	int data;
	node next=null;
	public node(int n) {
		this.data=n;
	}
	
	void append(int n) {
		node end = new node(n); //���ο� ��ũ�� �������ϴ� ���
		node NodeMe = this; //��� ��� (�Ǿ�) 
		while(NodeMe.next!=null) {
			NodeMe=NodeMe.next;
		}
		NodeMe.next=end; //�ǳ��� �ٿ��ִ� �۾�
		}
	
	void delete (int n) {
		node NodeMe = this;
		while(NodeMe.next!=null) {
			if(NodeMe.next.data==n) {
				NodeMe.next=NodeMe.next.next; //������� ���󰡰� �״������ ����.
			} else {
				NodeMe=NodeMe.next; //���� �ٸ���쿡�� �ٸ� ��带 ã��
			}
		}
	}
	
	void printAll() {
		node NodeMe=this;
		while(NodeMe.next!=null) {
			System.out.print(NodeMe.data+"->");
			NodeMe=NodeMe.next; //���� ���̿� �ؽ�Ʈ ����.
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
