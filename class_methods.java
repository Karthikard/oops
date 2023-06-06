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
