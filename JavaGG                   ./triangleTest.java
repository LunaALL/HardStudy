package Algorithms;

public class triangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       triangleLU(5);
       triangleRU(5);
       triangleRB(5);
	}
	
	static void triangleLU(int n) {
		for(int j=n;j>0 ;j--) {
			
		for(int i=0; i<j;i++) {
			System.out.print("*");
		}
		System.out.println("");
		}
	}
	static void triangleRU(int n) { //오른쪽 위가 직각 
		int a=0;
		for(int j=n;j>0 ;j--) {
			if(a>0) {
				for(int h=1; h<=a;h++) {
					System.out.print(" ");	
				}
			}
			for(int i=0; i<j;i++) {
				System.out.print("*");	
			}
			System.out.println("");
			a++;
			
		}
	}
	
	static void triangleRB(int n) { // 오른쪽 아래가 직각
		int a=n;
		for(int j=1;j<=n ;j++) {
			if(a>0) {
				for(int h=1; h<a;h++) {
					System.out.print(" ");	
				}
			}
			for(int i=0; i<j;i++) {
				System.out.print("*");	
			}
			System.out.println("");
			a--;
			
		
		}
		
	}
}
