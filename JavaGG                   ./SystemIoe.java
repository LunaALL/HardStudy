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
		// ����Ʈ ��Ʈ���� �̿��Ͽ� ���ڿ� ����! ���� system.out�� printStream�� ������. 
		Myinfo hu1=new Myinfo("���� �ڹ� ���α׷����Դϴ�.");
		
		System.out.println(hu1);
		System.out.printf("���� %d, ������ %dkg �Դϴ�.",24,72);
	    	
	    
	    
	    OutputStream n1 = new FileOutputStream("Txtinfo.txt");
	    PrintStream pr1= new PrintStream(n1);
	    pr1.print("���̷�����");
	    pr1.println("�� �Ұ��� ����");
	    
	    pr1.println(hu1);
		pr1.printf("���� %d, ������ %dkg �Դϴ�.",26,72);
		pr1.print("�����ϴ� ������ ���屹!!!");
	}

}
