package chp24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
class Myinfo {
	String info;
	public Myinfo (String info) {this.info=info;}
	public String toString() {return info;}
}


public class SystemIoe {

	public static void main(String[] args) throws IOException {
		// 프린트 스트림을 이용하여 문자열 저장! 원래 system.out은 printStream을 참조함. 
		Myinfo hu1=new Myinfo("저는 자바 프로그래머입니다.");
		
		System.out.println(hu1);
		System.out.printf("나이 %d, 몸무게 %dkg 입니다.",24,72);
	    	
	    
	    
	    OutputStream n1 = new FileOutputStream("Txtinfo.txt");
	    PrintStream pr1= new PrintStream(n1);
	    pr1.print("하이루루루루루");
	    pr1.println("내 소개를 하지");
	    
	    pr1.println(hu1);
		pr1.printf("나이 %d, 몸무게 %dkg 입니다.",26,72);
		pr1.print("좋아하는 음식은 해장국!!!");
	}

}
