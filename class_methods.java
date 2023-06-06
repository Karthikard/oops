//circle class

public class Main
{
	public static void main(String[] args) {
		circle c=new circle();
		c.radius(10);
		c.perimeter(1);
		circle c2=new circle();
		c2.radius(10);
	}
}
class circle 
{
    double a1,a2;
    public void radius(int r1)
    {
        a1=Math.PI*r1*r1;
        System.out.println(a1);
    }
    public void perimeter(int r2)
    {
        a2=2*Math.PI*r2;
        System.out.println(a2);
    }
}


//rectangle class
public class Main
{
	public static void main(String[] args) {
		rectangle r1=new rectangle();
		r1.area(10,20);
		r1.perimeter(10,20);
		System.out.println(r1.issquare(10,20));
	}
}
class rectangle
{
    int area,perimeter;
    public void area(int l,int b)
    {
        area=l*b;
        System.out.println(area);
    }
    public void perimeter(int l,int b)
    {
        perimeter=2*l+2*b;
        System.out.println(perimeter);
    }
    public boolean issquare(int l,int b)
    {
        if(l==b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
