/*
method overriding : If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In the below example display method are present in both the classes , when subclass object invokes display method , the output will be only subclass display ...
*/


public class Main
{
	public static void main(String[] args) {
		child c1=new child();
		c1.display();
	}
}
class supers
{
    public void display()
    {
        System.out.println("super hello");
    }
}
class child extends supers
{
    public void display()
    {
        System.out.println("Child display");
    }
}

/* output
Child display
*/
