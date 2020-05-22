package Month05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class human{
	private String name;
	private int age;
	private double �÷�;
	
	public human(String name, int age, double �÷�) {
		this.name=name;
		this.age=age;
		this.�÷�=�÷�;
	}
	
	public String toString() {
		return name+" ���� : "+ age+" �÷�: "+ �÷�;
	}
	
	public static final Comparator<human> human_order=new AgeOrderComparator();
			
//�������̵�
	
	private static class AgeOrderComparator implements Comparator<human> {
		public int compare(human h1 , human h2) {
			return (h1.age > h1.age)? 1 :
				(h1.age < h1.age)? -1 : 0 ;
			
		}
	}
	
}




public class PhysExamhuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		human ��������[]= {
				new human("��", 112, 2.0),
				new human("��", 86, 2.0),
				new human("��", 130, 2.0),
				new human("Ŵ", 240, 2.0),
		};
		
		System.out.print("�� ���� ���ڸ� ã���ּ�??");
		int num=sc.nextInt();
		int idx=Arrays.binarySearch(��������, new human("", num, 0.0), human.human_order);
		
		if(idx<0) {
			System.out.println("�׷����� ����...");
		} else {
		System.out.println("�������� [" + (idx+1) + "] ��°�� �ֽ��ϴ�.");
		System.out.println("ã�� �����ʹ¿�~~~~ "+��������[idx].toString());
		}
		

	}

}
