/*
Static variable are declared inside a class which is shared between the objects.
if one object changes tha value of static variable automatically the value changes for other objects.
static variable can also be called  using class_name.variable_name.

Similarly static methods can be called using class name(without obj).
non static method can access static variables but vice versa not possible.
 inner class can be static but outer class cant be static.

*/
class test 
{
    static int x=10;
    int y=20;
    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);
    }
}
    

public class Main
{
	public static void main(String[] args) {
		System.out.println(test.x);  // 10
		
		test t1=new test();
		t1.show();                  //10 20
		
		test t2=new test();
		t2.show();                  //10 20
		
		t1.x=100;
		t1.y=200;
		
		test t3=new test();
		t3.show();                  //100 20
	}
}
