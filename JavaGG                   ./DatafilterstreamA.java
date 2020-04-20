package chp24;

import java.awt.BufferCapabilities.FlipContents;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class DatafilterstreamA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream out =new FileOutputStream("영화 1987 감상문.hwp");
		DataOutputStream filterout = new DataOutputStream(out);
		filterout.writeInt(127);
		filterout.writeDouble(2.0);
		filterout.close();
		
		InputStream in = new FileInputStream("영화 1987 감상문.hwp");
		DataInputStream filterIn = new DataInputStream(in);
		int num=filterIn.readInt();
		double num2 =filterIn.readDouble();
		filterIn.close();
		
		System.out.println(num);
		System.out.println(num2);
		
		

	}

}
