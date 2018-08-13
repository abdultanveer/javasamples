package multithreading;
class TestCallRun5 extends Thread{  
	public void run(){  
		System.out.println("running...");  
	}  
	public static void main(String args[]){  
		TestCallRun5 t1=new TestCallRun5();  
		t1.run();//fine, but does not start a separate call stack  
	}  
}