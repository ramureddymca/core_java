package basic;
class A{  
void msg(){System.out.println("Hello A");}  
}  
public class Test extends A{  
void msg(){System.out.println("Welcome B");}  

    public static void main (String args[])   
    {  
        A a = new Test();  
        Test t  = new Test();  
        t.msg();
        a.msg();  
    }  
}  