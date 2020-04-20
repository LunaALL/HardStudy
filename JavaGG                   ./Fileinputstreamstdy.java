package chp24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Fileinputstreamstdy {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//복사대상 파일은 프로젝트 파일 리소스 최 상단에 배치해야함<-point
		
		InputStream in = new FileInputStream("영화 1987 감상문.hwp");
		OutputStream out = new FileOutputStream("영화 1987 복사본1.hwp");
		
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
		System.out.println("복사된 바이트 크기"+copy);

	}

}
