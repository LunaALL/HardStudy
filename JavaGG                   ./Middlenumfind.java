package Algorithms;

public class Middlenumfind {
	
	public static int middlefind(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(a<=c) {
				return a;
			}
			else
				return c;
		}
		else if (a>c) {
			return a;
		}
		
		else if(b>c) {
			return b;
		}
		else
			return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=7;
		
		
	
	
	for(int i=1; i<4 ; i++) {
		for(int j=1 ; j<4 ; j++) { 
			for(int k=1 ; k<4 ; k++) {
				System.out.printf("%d-%d-%d",i,j,k);
				System.out.printf("middle =%d", middlefind(i, j, k));
				System.out.println("");
			}
			
		}
	}

}
	
	
}
