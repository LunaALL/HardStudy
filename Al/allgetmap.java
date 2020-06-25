package month06;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class allgetmap {

	private static Map<Integer, String> mp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mp =new HashMap<>();
		int i=1;
		mp.put(1, "하나입니다");
		mp.put(2, "둘입니다");
		mp.put(3, "셋입니다");
		
		System.out.println(getAllStringkey());
		System.out.println(getIntegerkey("하나입니다"));
		System.out.println(getIntegerkey("하난데"));
		
		System.out.println(i +"hashmap에 자료 ="+ collectFindkey(i));
		
	}
	
	public static Collection<String> getAllStringkey(){
		return mp.values();
	}
	
	public static boolean getIntegerkey(String str){
		return mp.containsValue(str);
		
	}
	
	public static boolean collectFindkey(int i){
		return mp.containsKey(i);
		
	}

}
