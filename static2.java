/* 
Static block
  when class is loaded static block gets executed.
*/
 public class Main
{
    static 
    {
        System.out.println("Block 1");
    }
	public static void main(String[] args) {
		System.out.println("main ");
	}
	static 
    {
        System.out.println("Block 2");
    }
}
/* output
  Block 1
  Block 2
  main 
*/
