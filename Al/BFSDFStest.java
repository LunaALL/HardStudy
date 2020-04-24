package Algorithms;


import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

class Queue<T>{
	class node<T> {
	    T item;
	    node<T> next;
	    public node(T item) {
	    	this.item=item;
	    }
	}
	
	node<T> first; //�����°�
	node<T> last; //���°�
	
	public void add (T item) {
		node<T> n1 =new node<T>(item);
		if(last!=null) {
			last.next=n1;
		}
		last=n1	;
		if(first==null) {
			first=last;
		}
		
	}
	
	public T remove() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		T item = first.item;
		first=first.next;
		
		if(first==null) {
			last=null;
		}
		return item;
			
		
	}
	
	public T peek() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		return first.item;
	}
	
	
	public boolean isEmpty() {
		
		return first==null;
	}
}

class Graph {
	class Node{
		int data;
		LinkedList<Node> adjacent;	
		boolean marked;
		Node(int data) {
			this.data=data;
			this.marked=false;
			adjacent =new LinkedList<Node>();	
		}   //�̳� Ŭ���� 
		
	}
	
	Node [] nodes; //�׷���
	Graph(int size){ //�׷��� ������ ����
	  nodes =new Node[size];
	  for(int i=0; i<size ; i++) {
		  nodes[i]= new Node(i);//0���� ���� -1���� ��� �鰨.
	  }
	}
	
	void addEdge(int i1, int i2) {
		//�� ����� ���踦 �����ϴ� �Լ�
		Node n1= nodes[i1];
		Node n2= nodes[i2];
		
		//�ΰ��� ��忡 ������ ��帪 �����ϴ� ��ũ�� ����Ʈ�� ������ �ִ��� Ȯ��, ������ ����
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		//���ڿ��� ���Ե� �ִ��� Ȯ���ϴ� contains �޼��� 

		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	
	}
	void dfs() {
		dfs(0);
	}
	
	
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack =new Stack<Graph.Node>();
		stack.push(root);
		root.marked=true; //�ѹ� ���ٴ� ��
		while(!stack.isEmpty()) { //������� ������ ����
			Node r = stack.pop();
			for(Node n : r.adjacent) {
				if(n.marked==false) {
					n.marked=true;
					stack.push(n);
				}
			}
			visit(r);	
		}
	}
	
	void bfs() {
		bfs(0);
	}
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue =new Queue<Node>();
		queue.add(root);
		root.marked =true;
		
		while(!queue.isEmpty()) {
			Node r = queue.remove(); //ť���� ������ ������
			for (Node n: r.adjacent) {
				if(n.marked==false) {
					n.marked=true;
					queue.add(n);
				}
			}
			visit(r);
		}
	}
	
	
	//���ȣ�� dfs �����
	void dfsR(Node r) {
		if(r==null) return;
		r.marked=true;
		visit(r);
		for(Node n : r.adjacent) {
			if(n.marked== false) {
				dfsR(n);
			}
		}
	}
	
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	void dfsR() {
		dfsR(0);
	}
	
	
	
	
	
	void visit(Node n) {
		System.out.println(n.data + " ");
	
	}
}


/*   0
 *  /
 * 1 -- 3      7
 * I    I \   / 
 * I    I   5
 * 2 -- 4    \ 
 *             6 - 8

 * 
 */

public class BFSDFStest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();

		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		//g.dfs();
		//0 1 3 5 7 6 8 4 2 0.004��
		//g.bfs();
		//0 1 2 3 4 5 6 7 8 0.006��
		g.dfsR(); 
		//0 1 2 3 4 5 6 7 8 0.004�� 
		
		
		long end = System.currentTimeMillis();
		System.out.println(" ���� �ð� : " + (end - start)/1000.0 + "��");
		
	
	}

}
