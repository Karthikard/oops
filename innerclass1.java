/*
To reduce the complexity of large class ,inner class are used.
Inner class can access the members of outer class.
Objects for inner class must be created inside the outer class.
Outer class cannot use the members of inner class directly unless it has created the object.

*/

class Main 
{
    public static void main (String[] args) {
       outer o=new outer();
       o.outerdisplay();
    }
}
class outer 
{
    int x=10;
    class inner 
    {
        int y=20;
        public void innerdisplay()
        {
            System.out.println(x+"  "+y);
        }
    }
    public void outerdisplay()
    {
        inner i=new inner();
        i.innerdisplay();
        System.out.println(i.y);
        
    }
}
/* output
  10  20
  20
*/
