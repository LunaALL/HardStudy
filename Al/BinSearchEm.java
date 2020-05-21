package Month05;

import java.util.Scanner;

public class BinSearchEm {

	
	static int binsearch(int[] arr, int n , int key) {
		int first=0;  //ó��
		int last=n-1; //��
		System.out.print("  |");
		for(int i=0; i<n;i++) {
			System.out.printf("%2d ",i);
		}
		System.out.printf("\n--+--------------------------\n");
		System.out.print("  |");
		for(int e: arr) {
			System.out.printf("%2d ",e);
		}
		do {
			int pc= (first+last)/2; //�߰��� ã��
			if(arr[pc]==key) {
				int Find=pc;
				while(Find>0) {
					Find--;
					if(arr[Find]==key) {
						System.out.println("������ ã�Ҵ�!");
					}else {
						System.out.println("\n���̻� ���� ������");
						return Find+1;
					}
				}
			}
				
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
		/*
		System.out.print("��ڼ� �Է� : ");
		int num=SC.nextInt();
		
		int[] arr = new int[num];
		int[] arr3 = new int[num]; //�ߺ��� ã���. 
		
		System.out.println("���ϴ� ���� �������� �Է�");
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"] :");
			arr[i]=SC.nextInt();
		}	
		
		bubblesort(arr, arr.length-1);
		System.out.println("�����ϰڽ���");
		for(int e : arr) {
			System.out.print(e+ "|");
		}

		System.out.print("\n�˻��� ��: ");
		int key=SC.nextInt();
		*/
		
		int[] arr= {1,5,8,12,12,12,15,30,36};
		int key=12;
		
		
		
		
		int Sec=binsearch(arr, arr.length , key);
		if(Sec==-1) {
			System.out.println("�ƹ��� ã�ƺ��� �����ٰ� �Ѵ�....");
		}else
			System.out.print("�ߺ��� ù��° ��ġ�� =");
			System.out.println("arr["+(Sec)+"]");

	}
}
