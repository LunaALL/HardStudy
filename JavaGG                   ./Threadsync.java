package studyAAAA;

class Iitem {
	int num1=0;
	int num2=0;
	/*
	public void addonenum() {num1+=1;}
	public void addtwonum() {num1+=2;}
	
	
	public void addonenum1() {num2+=1;}
	public void addtwonum1() {num2+=2;} µ¿±âÀü 
	*/
	
	public void addonenum() 
	{ synchronized (this) {
		num1+=1;}
	}
	public void addtwonum() {
		synchronized (this) {
			num1+=2;}
	}
	
	
	public void addonenum1() {
		synchronized (key1) {
			num2+=1;
		}
		}
	public void addtwonum1() {
		synchronized (key1) {
			num2+=2;
		}
		}
	
	
	
	
	public void showAll() {
		System.out.println("num1 =" +num1);
        System.out.println("num2 =" + num2);
        
	}
	
	Object key1= new Object();
	
}



class AccessThread extends Thread {
	Iitem iteminst;
	public AccessThread (Iitem item ) {
		iteminst=item;
	}
	public void run() {
		iteminst.addonenum();
		iteminst.addonenum1();
		
	    iteminst.addtwonum();
	    iteminst.addtwonum1();
		
	}
	
	
}

public class Threadsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Iitem item1 =new Iitem();
	AccessThread a1 =new AccessThread(item1);
	AccessThread a2 =new AccessThread(item1);
	
	a1.start();
	a2.start();
	
	try {
		a1.join();
		a2.join();
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	item1.showAll();
	}

}
