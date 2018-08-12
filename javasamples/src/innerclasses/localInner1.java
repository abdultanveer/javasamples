package innerclasses;
public class localInner1{  
	private int data=30;//instance variable  
	void display(){  
		class Local{  
			void msg(){System.out.println(data);}  
		}  
		Local l=new Local();  
		l.msg();  
	}  
	public static void main(String args[]){  
		localInner1 obj=new localInner1();  
		obj.display();  
	}  
}

/*import java.io.PrintStream;  
class localInner1$Local  
{  
    final localInner1 this$0;  
    localInner1$Local()  
    {     
        super();  
        this$0 = Simple.this;  
    }  
    void msg()  
    {  
        System.out.println(localInner1.access$000(localInner1.this));  
    }  
}  */