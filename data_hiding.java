//get and set methods are used

public class Main
{
	public static void main(String[] args) {
		rectangle r1=new rectangle();
		r1.setlen(10);
		r1.setbreadth(20);
		r1.area();
		System.out.println("length = "+ r1.getlen());
		System.out.println("Breadth = "+ r1.getbreadth());
	}
}
class rectangle
{
    private int length;                  //private : data hiding
    private int breadth;
    int ans;
    public int getlen()
    {
        return length;
    }
    public int getbreadth()
    {
        return breadth;
    }
    public void setlen(int l)
    {
        length=l;
    }
    public void setbreadth(int b)
    {
        breadth=b;
    }
    public void area()
    {
        ans=length*breadth;
        System.out.println(ans);
    }
}

/*output
200
length=10
breadth=20*/
