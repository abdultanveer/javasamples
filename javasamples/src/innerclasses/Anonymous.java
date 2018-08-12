package innerclasses;
abstract class Anonymous{  
	abstract void eat();  
}  
class TestAnonymousInner{  
	public static void main(String args[]){  
		Anonymous p=new Anonymous(){  
			void eat(){System.out.println("nice fruits");}  
		};  
		p.eat();  
	}  
}

/*
Person p=new Person(){  
void eat(){System.out.println("nice fruits");}  
}; */

/*import java.io.PrintStream;  
static class TestAnonymousInner$1 extends Person  
{  
   TestAnonymousInner$1(){}  
   void eat()  
    {  
        System.out.println("nice fruits");  
    }  
}*/