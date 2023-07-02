/*
cannot create object for interface but reference can be created .
need to override all methods of interface.
interface are used for achieving run time polymorphism.
*/
class Main
{
    public static void main (String[] args) {
        test t1=new mytest();
        t1.meth1();
        t1.meth2();
        
    }
}
interface test 
{
    void meth1();
    void meth2();
}
class mytest implements test
{
    public void meth1()
    {
        System.out.println("Meth1 of myclass");
    }
    public void meth2()
    {
        System.out.println("Meth2 of myclass");
    }
   
}
/* output
  Meth1 of myclass
  Meth2 of myclass
*/
