package multithreading;
class TestGetName9 extends Thread{  
	public void run(){  
		System.out.println("running...");  
	}  
	public static void main(String args[]){  
		TestGetName9 t1=new TestGetName9();  
		TestGetName9 t2=new TestGetName9();  
		System.out.println("Name of t1:"+t1.getName());  
		System.out.println("Name of t2:"+t2.getName());  
		System.out.println("id of t1:"+t1.getId());  

		t1.start();  
		t2.start();  

		t1.setName("Sonoo Jaiswal");  
		System.out.println("After changing name of t1:"+t1.getName());  
	}  
}