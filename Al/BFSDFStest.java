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
	
	node<T> first; //나오는곳
	node<T> last; //들어가는곳
	
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
		}   //이너 클래스 
		
	}
	
	Node [] nodes; //그래프
	Graph(int size){ //그래프 사이즈 고정
	  nodes =new Node[size];
	  for(int i=0; i<size ; i++) {
		  nodes[i]= new Node(i);//0부터 개수 -1까지 노드 들감.
	  }
	}
	
	void addEdge(int i1, int i2) {
		//두 노드의 관계를 저장하는 함수
		Node n1= nodes[i1];
		Node n2= nodes[i2];
		
		//두개의 노드에 인접한 노드릉 저장하는 링크드 리스트에 상대방이 있는지 확인, 없으면 저장
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		//문자열이 포함되 있는지 확인하는 contains 메서드 

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
		root.marked=true; //한번 들어갔다는 것
		while(!stack.isEmpty()) { //비어있지 않을때 까지
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
			Node r = queue.remove(); //큐에서 데이터 가져옴
			for (Node n: r.adjacent) {
				if(n.marked==false) {
					n.marked=true;
					queue.add(n);
				}
			}
			visit(r);
		}
	}
	
	
	//재귀호출 dfs 만들기
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
		//0 1 3 5 7 6 8 4 2 0.004초
		//g.bfs();
		//0 1 2 3 4 5 6 7 8 0.006초
		g.dfsR(); 
		//0 1 2 3 4 5 6 7 8 0.004초 
		
		
		long end = System.currentTimeMillis();
		System.out.println(" 실행 시간 : " + (end - start)/1000.0 + "초");
		
	
	}

}
