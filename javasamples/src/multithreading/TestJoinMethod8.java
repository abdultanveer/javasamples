package multithreading;
class TestJoinMethod8 extends Thread{  
	public void run(){  
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		TestJoinMethod8 t1=new TestJoinMethod8();  
		TestJoinMethod8 t2=new TestJoinMethod8();  
		TestJoinMethod8 t3=new TestJoinMethod8();  
		t1.start();  
		try{  
			t1.join(1500);  
		}catch(Exception e){System.out.println(e);}  

		t2.start();  
		t3.start();  
	}  
}