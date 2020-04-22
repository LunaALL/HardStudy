package cha1;

public class twodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ans = new StringBuilder();
           int n=16;
           
		  while(n>0){

		   int r = n%2;

		   if (r < 10)
		    ans.append((char)(r + '0'));
		   else
		    ans.append((char)(r-10+'A'));

		   n/=2;

		  }

		  System.out.println(ans.reverse());
		
		
	}

}
