package Algo;

import java.util.Scanner;

public class Numberdivi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ټ� �ڸ��� ���� 1���� �Է¹޾� �� �ڸ����� ������ ����Ѵ�.
     Scanner sc = new Scanner(System.in);
     StringBuilder sb = new StringBuilder();
     int Num=sc.nextInt();
     
     while(true) {
    	 sb.append(Num%10);
    	 Num/=10;
    	 
    	 if(Num<10) {
    		 sb.append(Num);
    		 break;
    	 }
    	 
     }
     sb.reverse();
     System.out.println("["+sb.charAt(0)+"0000]");
     System.out.println("["+sb.charAt(1)+"000]");
     System.out.println("["+sb.charAt(2)+"00]");
     System.out.println("["+sb.charAt(3)+"0]");
     System.out.println("["+sb.charAt(4)+"]");
    
     
     /*
     while(true) {
    	 
    	 System.out.println(Num%10);
    	 Num/=10;
    	 
    	  	
    	 if(Num<10) {
    		 System.out.println(Num);
    		 break;
    	 }
    	 
     }
     */
		
		

	}

}
