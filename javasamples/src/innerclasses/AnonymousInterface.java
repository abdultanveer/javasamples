package innerclasses;
interface AnonymousInterface{  
	void eat();  
}  
class TestAnnonymousInner1{  
	public static void main(String args[]){  
		AnonymousInterface e=new AnonymousInterface(){  
			public void eat(){System.out.println("nice fruits");}  
		};  
		e.eat();  
	}  
} 
/*
Eatable p=new Eatable(){  
void eat(){System.out.println("nice fruits");}  
}; */

/*import java.io.PrintStream;  
static class TestAnonymousInner1$1 implements Eatable  
{  
TestAnonymousInner1$1(){}  
void eat(){System.out.println("nice fruits");}  
}*/