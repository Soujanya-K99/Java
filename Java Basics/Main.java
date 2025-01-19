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
/*
//this keyword program

public class Main
{
    //int x,y;
	public static void main(String[] args) {
        Main t= new Main();
        System.out.println("main method:"+t);
        t.m1();
        t.m2(); 
    }

    void m1(){
        System.out.println("m1:"+this);
    }
    void m2(){
        System.out.println("m2:"+this);
    }
}

//output:
// main method:Main@2f92e0f4
// m1:Main@2f92e0f4
// m2:Main@2f92e0f4
*/
/* 
// static blocks
 class Main{
    static{
        System.out.println("java program can be executed without main method using static blocks to some extent");
        System.exit(123); //exit is the static method of System class used to terminate the program execution.
    }
}
*/
//static blocks using instance fields (non static int x=10)
/* 
public class Main{
    int x=10;
    static{
        Main m=new Main();
       m.x-=11; //use obj ref o call non static instance fields to access in static context
       System.out.println("1 method:"+m.x);
    }
    static{
        Main m=new Main();
        m.x+=12;
        System.out.println("2 method:"+m.x);
    }
    public static void main(String[] args) {
       Main m=new Main();
        m.x+=6;
        System.out.println("main method:"+m.x);
    }
        static{
            Main m=new Main();
            m.x-=13;
            System.out.println("3 method:"+m.x);
        }
}

// output:
// 1 method:-1
// 2 method:22
// 3 method:-3
// main method:16
*/
//static blocks using static int x=10
//static variable values will be changing 
/*public class Main{
    static int x=10;
    static{
        x-=11; //x=10-11;x=-1;
        System.out.println("1 method:"+x);
    }
    static{
        x+=12; //x=-1+12; x=11;
        System.out.println("2 method:"+x);
    }
    public static void main(String[] args) {
        x+=6; //x=-2+6; x=4;
        System.out.println("4 main method:"+x);
    }
        static{
           x-=13; //x=11-13; x=-2;
           System.out.println("3 method:"+x);
        }
}
// output:
// method:-1
// 2 method:11
// 3 method:-2
// 4 main method:4
*/
//static method
/*
public class Main{
    static int sqrt(int x){
        return x*x;
    }
    public static void main(String args[]){
        int r =sqrt(2);
        System.out.println("accessing using method name directly:"+r);

        Main m=new Main();
        int r1=m.sqrt(3);
        System.out.println("accessing using object reference:"+r1);

        int r2=Main.sqrt(4);
        System.out.println("accessing using class name:"+r2);
    }
}
// output:
// accessing using method name directly:4
// accessing using object reference:9
// accessing using class name:16     

//compare the contents of 2 objects same or not
*/
public class Main{
    int x,y;
    public static void main(String args[]){
        Main S1=new Main();
        S1.setData(10,20);
        Main S2=new Main();
        S2.setData(110,220);
       boolean r=S1.compare(S2);//false
        if(r)//if(false)--.it will execute else
        System.out.println("same");
        else
        System.out.println("not same");
    }
   void setData(int a, int b){
        x=a;y=b;
    }
    boolean compare(Main o){//o=s2 of type Main. s2 is the obj ref of Main type.it holds the object.
       if(o.x==x&&o.y==y)//s2==x &&s2==y;110==10&&220==20;false
       return true;
       else
       return false;//false
    }
}

//output:not same