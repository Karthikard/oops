class Main
{
    public static void main (String[] args) {
        store s=new store();
        customer c1=new customer("Rd");
        customer c2=new customer("Karthika");
        
        s.register(c1);
        s.register(c2);
        
        s.invitesale();
        
    }
}
class store 
{
    member mem[]=new member[10];
    int count =0;
    void register(member m)
    {
        mem[count++]=m;
    }
    void invitesale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callback();
        }
    }
}
class customer implements member
{
    String name;
    customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok i will visit "+name);
    }
}
interface member
{
    public void callback();
}

/*output
  Ok i will visit Rd
Ok i will visit Karthika
*/
