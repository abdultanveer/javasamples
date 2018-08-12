package innerclasses;
class StaticNested{  
	static int data=30;  
	static class Inner{  
		void msg(){System.out.println("data is "+data);}  
	}  
	public static void main(String args[]){  
		StaticNested.Inner obj=new StaticNested.Inner();  
		obj.msg();  
	}  
} 

/*import java.io.PrintStream;  
static class TestOuter1$Inner  
{  
TestOuter1$Inner(){}  
void msg(){  
System.out.println((new StringBuilder()).append("data is ")  
.append(TestOuter1.data).toString());  
}    
}  */

