package chp24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Fileinputstreamstdy {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//������ ������ ������Ʈ ���� ���ҽ� �� ��ܿ� ��ġ�ؾ���<-point
		
		InputStream in = new FileInputStream("��ȭ 1987 ����.hwp");
		OutputStream out = new FileOutputStream("��ȭ 1987 ���纻1.hwp");
		
		int copy=0;
		int bdata;
		byte buf[] =new byte[1024];
		
		while(true) {
			bdata=in.read(buf);
			if(bdata==-1) {
				break;
			}
			out.write(buf,0,bdata);
			copy+=bdata;
			
		}
		
		in.close();
		out.close();
		System.out.println("����� ����Ʈ ũ��"+copy);

	}

}
