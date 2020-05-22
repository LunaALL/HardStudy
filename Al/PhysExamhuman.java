package Month05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class human{
	private String name;
	private int age;
	private double 시력;
	
	public human(String name, int age, double 시력) {
		this.name=name;
		this.age=age;
		this.시력=시력;
	}
	
	public String toString() {
		return name+" 나이 : "+ age+" 시력: "+ 시력;
	}
	
	public static final Comparator<human> human_order=new AgeOrderComparator();
			
//오버라이딩
	
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
		
		human 인적정보[]= {
				new human("김", 112, 2.0),
				new human("하", 86, 2.0),
				new human("손", 130, 2.0),
				new human("킴", 240, 2.0),
		};
		
		System.out.print("몇 살인 남자를 찾고있소??");
		int num=sc.nextInt();
		int idx=Arrays.binarySearch(인적정보, new human("", num, 0.0), human.human_order);
		
		if(idx<0) {
			System.out.println("그런놈은 없다...");
		} else {
		System.out.println("인적정보 [" + (idx+1) + "] 번째에 있습니다.");
		System.out.println("찾은 데이터는요~~~~ "+인적정보[idx].toString());
		}
		

	}

}
