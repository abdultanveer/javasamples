package multithreading;
class CurrentThread10 extends Thread{  
	public void run(){  
		System.out.println(Thread.currentThread().getName());  
	}  

public static void main(String args[]){  
	CurrentThread10 t1=new CurrentThread10();  
	CurrentThread10 t2=new CurrentThread10();  

	t1.start();  
	t2.start();  
}  
} 