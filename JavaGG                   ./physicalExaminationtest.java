package Algo;

import Algo.Dayofyeartest;

public class physicalExaminationtest {

	static final int VMAX = 21; // �÷��� ���� (0.0���� 0.1 ������ 21��)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhyscData[] x = { 
				new PhyscData("�̳���", 162, 0.3), 
				new PhyscData("������", 173, 0.7),
				new PhyscData("�̼���", 175, 2.0), 
				new PhyscData("ȫ�ر�", 171, 1.5), 
				new PhyscData("������", 168, 1.2),
				new PhyscData("��ȣ��", 174, 1.2), 
				new PhyscData("���Ѱ�", 169, 0.8), 
				new PhyscData("������",162, 1.2)};
		int[] vdist = new int[VMAX]; // �÷��� ����

		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println(" �̸�      Ű      �÷�");
		System.out.println("--------------");
		
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n���Ű��%5.1fcm\n", aveHeight(x));

		distVision(x, vdist); // �÷��� ������ ���մϴ�.

		System.out.println("\n�÷��� ����");
		
		for(int i =0; i<VMAX; i++) {
			if(vdist[i]>0) {
				System.out.println("1���̻�");
			}
			System.out.printf("%3.1f~ : ", i/10.0);
			print(vdist[i]);
			System.out.println("");
			
		}
		
		YMD y1=new YMD(2020,3,10);
		y1.after(50);
		
		

	}
	
	static void print(int n) {
		if(n!=0) {
			for(int i =0; i<n ; i++) {
				System.out.print("*");
			}
		}
		
		
	}
	
	

	static class PhyscData {
		String name; // �̸�
		int height; // Ű
		double vision; // �÷�

		// ������
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// Ű�� ��հ��� ���մϴ�.
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;
	}

	// �÷��� ������ ���մϴ�.
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;
		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
	}
	
	

}

class YMD{
	int y;
	int m;
	int d;

	

	
	public YMD(int y, int m, int d) {
		this.y=y;
		this.m=m;
		this.d=d;
		
	}
	//2020 5 �� 20�� + 10���ĸ� 
    public void after(int n) {
    	d=d+n;
    	int nam= d%31;
    	
    	System.out.printf("%4d�� %2d�� %d�� �Դϴ�.",y, (d/31>=1) ? d/31+m : m , d%31);
    	
	}
	
}
