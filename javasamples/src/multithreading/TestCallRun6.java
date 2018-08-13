package multithreading;
class TestCallRun6 extends Thread{  
	public void run(){  
		for(int i=1;i<5;i++){  
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		TestCallRun6 t1=new TestCallRun6();  
		TestCallRun6 t2=new TestCallRun6();  

		t1.run();  
		t2.run();  
	}  
}