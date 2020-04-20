package chp24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class DataThreeStreamconfig {
	
	public static void performanceTest(DataOutputStream dataOut) throws IOException {
		long startTime=System.currentTimeMillis();
		for(int i=0; i<1000; i++) {
			for(int j=0 ; j<1000; j++) {
				dataOut.writeDouble(12.345);
			}
			
		}
		dataOut.flush();
		long endTime = System.currentTimeMillis();
		System.out.println("경과 시간 : "+ (endTime-startTime));
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream out1 =new FileOutputStream("data.bin");
		DataOutputStream dataOut=new DataOutputStream(out1);
		performanceTest(dataOut);
		dataOut.close();
		
		
		
		OutputStream out2 =new FileOutputStream("data.bin");
		BufferedOutputStream buffilterOut= new BufferedOutputStream(out2,1024*10);
		//기본 타입을 보내는 데이터 아웃풋스트림이 데이터를 보내기 이전에, 버퍼 스트림에 저장해야함. 순서 
		DataOutputStream filterout = new DataOutputStream(buffilterOut);
		performanceTest(filterout);
		filterout.close();
		
		
		//노 버퍼 14313밀리초 , 버퍼 이용 301 밀리초 
		
		

	}

}
