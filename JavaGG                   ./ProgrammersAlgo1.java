

public class ProgrammersAlgo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=20;
		System.out.println(solution(3,5));
		
		System.out.println(solution2(350));

	}
	
	public static long solution(int start,int end) {
	   long answer=0;
		if(start==end) {
			return start;
		}
		
		for(int i=start; i<=end;i++) {
			answer+=i;
		}
		
		return answer;
	}
	
	public static int solution2(int n){
		int number=n;
		if(n<10) {
			return number;
		}
		return (number%10) + solution2(number/10);
		
		
		
		
	}

}
