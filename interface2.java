class Main
{
    public static void main (String[] args) {
        phone s1=new smartphone();
        s1.call();
        s1.msg();
        System.out.println();
        icamera s2=new smartphone();
        s2.click();
        s2.record();
        System.out.println();
        
    }
}
class phone
{
    void call()
    {
        System.out.println("Phone call");
    }
    void msg()
    {
        System.out.println("Phone msg");
    }
}
interface icamera
{
    void click();
    void record();
}
interface imusic
{
    void play();
    void stop();
}
class smartphone extends phone implements icamera,imusic
{
    public void vcall()
    {
        System.out.println("Smart phone video calling");
    }
    public void click()
    {
        System.out.println("Smart phone click photo");
    }
    public void record()
    {
        System.out.println("Smart phone record video");
    }
    public void play()
    {
        System.out.println("Smart phone play music");
    }
    public void stop()
    {
        System.out.println("Smart phone stop music");
    }
}
/*
output
Phone call
Phone msg

Smart phone click photo
Smart phone record video
*/
