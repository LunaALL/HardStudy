package Algorithms;

public class GuGumatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean Test=true;
		int n=1;
		System.out.println(" |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+------------------------");
		for(int i=1 ; i<=9; i++) {
			System.out.printf("%1d|",i);
			for(int j=1 ; j<=9; j++) {
				System.out.printf("%3d",(i+j));
			}
			System.out.println("");
			
		}

	}

}
