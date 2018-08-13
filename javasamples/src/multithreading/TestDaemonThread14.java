package multithreading;
class TestDaemonThread14 extends Thread{  
	public void run(){  
		System.out.println("Name: "+Thread.currentThread().getName());  
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	}  

	public static void main(String[] args){  
		TestDaemonThread14 t1=new TestDaemonThread14();  
		TestDaemonThread14 t2=new TestDaemonThread14();  
		t1.start();  
		t1.setDaemon(true);//will throw exception here  
		t2.start();  
	}  
}