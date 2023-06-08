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
