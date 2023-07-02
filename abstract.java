/* There are two kinds of class : Abstract class and concrete class .
  Abstract class contains abstract keyword . ex: abstract class rectangle.
  when a method is created as abstract then the class must be abstract.
  abstract class do not have objects but can have reference.
  when a class is derived from abstract class , then the derived class will also become abstract class.To avoid these overriding of method must take place.

abstract class main1
{
  abstract void num(){};
}
class main2 extands main1
{
  void num()
  {
    psvm("welcome");
  }
}
*/ 

abstract class Shape
{
	abstract public double perimeter();
	abstract public double area();
	
}
class circle extends Shape
{
    double r;
    public double perimeter()
    {
        return 2*Math.PI*r;
    }
    public double area()
    {
        return Math.PI*r*r;
    }
}
class rectangle extends Shape
{
    double l,b;
    public double perimeter()
    {
        return 2*l + 2*b;
    }
    public double area()
    {
        return l*b;
    }
}
  
class Main
{
    public static void main (String[] args) {
        circle c1 = new circle();
        c1.r=3;
        Shape s=c1;
        System.out.println(s.area());
    }
}
/* output
  28.274333882308138
*/
