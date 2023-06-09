//Inheritance : Process of acquiring features from existing class to new class.

public class Main
{
	public static void main(String[] args) {
		cylinder c1=new cylinder();
		c1.radius=5;
		c1.height=10;
		System.out.println("Volume = "+c1.volume());
		System.out.println("Area = "+c1.area());
		System.out.println("Perimeter = "+c1.perimeter());
		System.out.format("Circumference = %.2f",c1.circumference());
	}
}
class circle 
{
    public double radius;
    public double area()
    {
        return 3.14*radius*radius;
    }
    public double perimeter()
    {
        return 2*3.14*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
class cylinder extends circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
    
}
/* OUTPUT 
Volume = 785.0
Area = 78.5
Perimeter = 31.400000000
*/


//inheritance and constructor

class Main
{
	public static void main(String[] args) {
		one n1=new one (); // output:one
		two n2=new two(); // output:one two
	}
}
class one 
{
    public one()
    {
        System.out.println("One");
    }
}
class two extends one
{
    public two()
    {
        System.out.println("Two");

    }
}
/* output
	one 
	one
	two
 */

//parameterized constructor in inheritance

class Main
{
	public static void main(String[] args) {
		two n2=new two(20);	
	}
}
class one 
{
    public one()
    {
        System.out.println("One");
    }
    public one(int n)
    {
        System.out.println("Parameterized one");
    }
}
class two extends one
{
    public two()
    {
        System.out.println("Two");
    }
    public two(int n)
    {
        System.out.println("Parameterized two");
    }
}
/* output
	One
	Parameterized two
*/

// super 

class Main
{
	public static void main(String[] args) {
		two n2=new two(10,20);
		
	}
}
class one 
{
    public one()
    {
        System.out.println("One");
    }
    public one(int n)
    {
        System.out.println("Parameterized one "+n);
    }
}
class two extends one
{
    public two()
    {
        System.out.println("Two");
    }
    public two(int n)
    {
        System.out.println("Parameterized two "+ n);
    }
    public two(int x,int y)
    {
        super(x);
        System.out.println(x+" "+y);
    }
}
/* output
	Parameterized one 10
	10 20
*/

class Main
{
	public static void main(String[] args) {
		cuboild c1=new cuboild();
		System.out.println(c1.volume()); // output : 1
		
		cuboild c2=new cuboild(10);
		System.out.println(c2.volume()); // output : 10
		
		cuboild c3=new cuboild(10,12,15);
		System.out.println(c3.volume()); //output : 1800
	}
}
class rectangle
{
    int len,brea;
    public rectangle()
    {
        len=brea=1;
    }
    public rectangle(int n1,int n2)
    {
        len=n1;
        brea=n2;
    }
}
class cuboild extends rectangle
{
    int height;
    public cuboild()
    {
        height=1;
    }
    public cuboild(int h)
    {
        height=h;
    }
    public cuboild(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    int volume()
    {
        return len*brea*height;
    }
}
