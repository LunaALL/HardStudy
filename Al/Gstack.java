package Month05;

public class Gstack<T> {

	int max;
	int ptr;
	T[] stk;
	
	public Gstack (int max) {
		ptr=0;
		this.max=max;
		stk=(T[])new Object[max];
		
	}
	
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}
	//예외클래스를 미리 만들어서 활용한다. 
	
	
	
	public T push(T x) throws OverflowGstackException
	{
		if(ptr>=max) {
			throw new OverflowGstackException();
		}
		
		return stk[ptr++]=x;
		
		
	}
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
		public T pop() throws EmptyGstackException {
			if (ptr <= 0)									// 스택이 비어 있음
				throw new EmptyGstackException();
			return stk[--ptr];
		}

		// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 
		public T peek() throws EmptyGstackException {
			if (ptr <= 0)									// 스택이 비어 있음
				throw new EmptyGstackException();
			return stk[ptr - 1];
		}

		// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 
		public int indexOf(T x) {
			for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
				if (stk[i] == x)
					return i;								// 검색 성공
			return -1;										// 검색 실패
		}

		
		public void clear() {
			ptr = 0;
		}

		
		public int capacity() {
			return max;
		}

		
		public int size() {
			return ptr;
		}

		
		public boolean isEmpty() {
			return ptr <= 0;
		}

		
		public boolean isFull() {
			return ptr >= max;
		}
		
		
		public void printall() {
			if (ptr <= 0)
				System.out.println("스택이 비어 있습니다.");
			else {
				for (int i = 0; i < ptr; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
		}
}
