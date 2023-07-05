/*
final variables are constants (cannot modify).
final class sant be extended.
final methods cannot be obverrided.
final variables cannot be modified.
*/
public class Main
{
    
	public static void main(String[] args) {
		final int a=10;
		System.out.println(a);           // 10
		System.out.println(a++);         // error
	}
	
}
