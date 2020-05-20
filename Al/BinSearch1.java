package Month05;

import java.util.Scanner;

public class BinSearch1 {
	static int binsearch(int[] arr, int n , int key) {
		int first=0;  //ó��
		int last=n-1; //��
		do {
			int pc= (first+last)/2; //�߰��� ã��
			if(arr[pc]==key)
				return pc;
			else if(arr[pc]<key) {
				first=pc+1;  //Ű�� �߰������� ũ�� ������ ��Ƽ�� 
			}else {  //Ű���� �߰����� ū���� ������Ƽ�ǿ��� ���
			    last=pc-1;
			}
		}while(first<=last); //
	
		
		return -1; //����
	}
	
	
	static void bubblesort(int[] arr, int last) {
		if(last>0) {
			for(int i=1 ; i<=last ; i++) {
				if(arr[i]<arr[i-1]) {
					swap(arr,i,i-1);
				}
			}
			bubblesort(arr,last-1);
		}
		
	}
	static void swap(int[] arr, int first, int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC= new Scanner(System.in);
		
		
		
		System.out.print("��ڼ� �Է� : ");
		int num=SC.nextInt();
		int[] arr = new int[num];
		
		System.out.println("���ϴ� ���� �������� �Է�");
		
		for(int i=0; i<num;i++) {
			
			System.out.print("x["+i+"] :");
			arr[i]=SC.nextInt();
			if(i>0) {
				if(arr[i-1]==arr[i]) {
					System.out.println("�ߺ��� �߰� �ٽ��ϼ�");
					return;
				}
			}
			
			
		}
		int [] arr2= {6,5,2,10,58,54,32,28,14};
		
		
		bubblesort(arr, arr.length-1);
		System.out.println("�����ϰڽ���");
		for(int e : arr) {
			System.out.print(e+ "|");
		}
		

		System.out.print("\n�˻��� ��: ");
	
		int key=SC.nextInt();
		
		
		int Sec=binsearch(arr, arr.length , key);
		if(Sec==-1) {
			System.out.println("�ƹ��� ã�ƺ��� �����ٰ� �Ѵ�....");
		}else
			System.out.println("arr ["+(Sec+1)+"] ���� ã�Ҽ�");
		
		

	

	}
}
