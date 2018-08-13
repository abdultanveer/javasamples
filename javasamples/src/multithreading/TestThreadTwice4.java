package multithreading;
public class TestThreadTwice4 extends Thread{  
	public void run(){  
		System.out.println("running...");  
	}  
	public static void main(String args[]){  
		TestThreadTwice4 t1=new TestThreadTwice4();  
		t1.start();  
		t1.start();  
	}  
}  