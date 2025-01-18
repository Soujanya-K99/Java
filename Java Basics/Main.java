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

//output:
// Hello World
// x value is:11
// y value is:2.5
*/

/* 
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
    
// output:
// x value is:11
// y value is:2.5
*/

/* printStream
import java.io.PrintStream;

public class Main {
    
    public static void main(String[] args) {
        PrintStream p = new PrintStream(System.out);
        p.println("This is a main method printing from PrintStream class");
    }
}
//output:This is a main method printing from PrintStream class
*/
/*
//formal parameters and actual arguments (addition program)
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

//output:30
*/

/*// formal parameters and actual arguments (sum of square root program)
public class Main
{
	public static void main(String[] args) {
        Main m= new Main(); //constructor
        int total =m.sqrt(4,5); //calling method
        System.out.println(total);
    }

    int sqrt(int a, int b){ //called method
         return (a*a)+(b*b);
    }
}
// output: 41
*/
/*
// Instance methods
public class Main
{
    int x,y;
	public static void main(String[] args) {
        Main m= new Main();//constructor /initializer method
        m.setData(10,20); //setter method /mutable
        m.getData();//getter method /immutable
       
    }

    void setData(int a,int b){
        x=a;
        y=b;     
    }

    void getData(){
       if(x>y){
        System.out.println("x is larger number:"+ x);
       } 
       else{
        System.out.println("y is larger number:"+ y);
       }
    }
}

//output= y is larger number:20
*/