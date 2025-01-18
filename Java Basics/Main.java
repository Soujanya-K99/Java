// Instance Fields can be accessed by using the object reference in both static or not static context in the other class.
/*public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Test t = new Test();
        System.out.println("x value is:"+t.x);
         System.out.println("y value is:"+t.y);
	}
}

class Test{
    int x =11; //instance fields
    float y =2.5f; //non static context and other class
}


// Instance Fields can be accessed by using the object reference in static context in the same class.
public class Main
{
    int x =11; //instance fields
    float y =2.5f;//static - within the same class and static context
    
	public static void main(String[] args) {
		Main t = new Main();
        System.out.println("x value is:"+t.x);
         System.out.println("y value is:"+t.y);
	}
}
    


import java.io.PrintStream;

public class Main {
    
    public static void main(String[] args) {
        PrintStream p = new PrintStream(System.out);
        p.println("This is a main method printing from PrintStream class");
    }
}


//formal parameters and actual arguments
public class Main
{
	public static void main(String[] args) {
        Main m =new Main();
        int s= m.sum(10,20);
        System.out.println(s);
        
	}
	int sum(int a,int b){
            
            return a+b;
        }
}

*/