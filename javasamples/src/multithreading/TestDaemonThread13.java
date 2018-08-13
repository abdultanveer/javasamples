package multithreading;
public class TestDaemonThread13 extends Thread{  
	public void run(){  
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			System.out.println("daemon thread work");  
		}  
		else{  
			System.out.println("user thread work");  
		}  
	}  
	public static void main(String[] args){  
		TestDaemonThread13 t1=new TestDaemonThread13();//creating thread  
		TestDaemonThread13 t2=new TestDaemonThread13();  
		TestDaemonThread13 t3=new TestDaemonThread13();  

		t1.setDaemon(true);//now t1 is daemon thread  

		t1.start();//starting threads  
		t2.start();  
		t3.start();  
	}  
}  