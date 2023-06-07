/* purpose : Initializing property while constructing the object itself. 
These constructors are automatically called when object is created.
Constructor do not have return type.
2 types : non paramaterized and parameterized contructor
constructor overloading is possible
*/


//constructor and data hiding concept


public class Main
{
	public static void main(String[] args) {
		rectangle r1=new rectangle();
		r1.setlen(10);
		r1.setbrea(20);
		System.out.println("Length = "+ r1.getlen());
		System.out.println("Breadth = "+ r1.getbrea());
		System.out.println("Area = "+ r1.area());
		System.out.println("Perimeter = "+ r1.perimeter());
	}
}
class rectangle
{
    private int length,breadth;
    public rectangle()                              //Non-parameterized constructor
    {
        length=1;
        breadth=1;
    }
    public rectangle(int l,int b)                  //Parameterized Constructor
    {
        length=l;
        breadth=b;
    }
    public int getlen()
    {
        return length;
    }
    public void setlen(int l)
    {
        length=l;
    }
    public int getbrea()
    {
        return breadth;
    }
    public void setbrea(int b)
    {
        breadth=b;
    }
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}
/* OUTPUT 
Length = 10
Breadth = 20
Area = 200
Perimeter = 60
*/
