// The method will be called depending on the object not reference

public class Main
{
	public static void main(String[] args) {
		supers c1=new child();     // super: reference   :: child : object
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


// A method which is not present in super class cant be called using reference. In the below example check() is not present in super class.
//thus calling of check() gives error

public class Main
{
	public static void main(String[] args) {
		supers c1=new child();
		c1.display();
		c1.check();
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
    public void check()
    {
        System.out.println("check");
    }
}

/* output

Main.java:14: error: cannot find symbol
		c1.check();
		  ^
  symbol:   method check()
  location: variable c1 of type supers
1 error 
*/
