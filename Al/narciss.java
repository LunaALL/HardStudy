package Algo;

import java.util.Scanner;

public class narciss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=narciss(n);
		if(a==1) {
			System.out.println("�� ���� �ھ� ������Դϴ�..."+n+"-> narcissistic number");
		}
		
	
	}
	
	private static int narciss(int n) {
		int num_size=1; //�ڸ��� ��� ����
		int num_save=n;
		while(true) { //�ڸ��� ��꿵��
			n=n/10;
			num_size++;
			if(n==1) {
				break;	
			}	
		}
		double sum=0; //���Ѱ� ����;
		int moc=0; //���� ��ȣ���� ���ڸ� ���� ��ȯ�� �����ϴ� �Լ�
		double temp=num_save;; //���� ���� ���� 
		
		for(int i=1; i<=num_size ;i++) {
			moc=num_save%10;
			num_save/=10;
			sum+=Math.pow(moc, num_size);
			System.out.println("sum�� ="+sum);
			}
		
		if(temp==sum) {
			return 1;
		} else {
			System.out.println("�ھ� ������� �ƴϳ׿�.����");	
		}
		
	
		return 0;
	}

}
