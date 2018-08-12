package innerclasses;
class NestedInterfaceEgA{  
  interface Message{  
   void msg();  
  }  
}  
  
class TestNestedInterface2 implements NestedInterfaceEgA.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  NestedInterfaceEgA.Message message=new TestNestedInterface2();//upcasting here  
  message.msg();  
 }  
}