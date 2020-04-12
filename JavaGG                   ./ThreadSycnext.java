package studyAAAA;

import java.util.Scanner;
class num {
	int num=0;
	int n=0;
	boolean num_5=false;
	public void addnum(int num) {
		this.num+=num;
		n++;
		if(n==5) {
			num_5=true;
			synchronized (this) {
				notifyAll();
			}
		}
		
	}
	
	public int getnum() {
		if(num_5==false) {
			
			try {
			
			synchronized (this) {
				wait();}
			} 
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return num;
	}
	
}



class Sum1 extends Thread{
	num numinst;
	int sum_a=0;
	public Sum1 (num numinst) {
		this.numinst=numinst;
	}
	
	public void run() {
		System.out.println("두 정수의 합은 "+ numinst.getnum());
	}
	
	
}

public class ThreadSycnext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		num numinst= new num();
		Sum1 s1= new Sum1(numinst);
		
		
		try {
			s1.start();
			
			System.out.println("정수 입력해주세요");
			for(int i=0; i<5; i++) {
				int n=sc.nextInt();
				numinst.addnum(n);
		    }
			s1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
