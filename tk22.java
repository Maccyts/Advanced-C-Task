import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    if(s.contains("0")&&s.charAt(0)!='0')
		System.out.println("Duck Number");
		else
		System.out.println("Not a Duck");
	}
}
