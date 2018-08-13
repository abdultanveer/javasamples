package multithreading;
class TestSleepMethod3 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestSleepMethod3 t1=new TestSleepMethod3();  
  TestSleepMethod3 t2=new TestSleepMethod3();  
   
  t1.start();  
  t2.start();  
 }  
}