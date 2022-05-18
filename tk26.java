import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="aeiou AEIOU";
		String r=sc.nextLine();
		String t="";
		for(int i=0;i<r.length();i++)
		{
		    String x=Character.toString(r.charAt(i));
		    if(!s.contains(x))
		    {
		        t=t+x;
		        s=s+x;
		        int b=(int)x.charAt(0);
		            if(b>=65&&b<=91)
		                b=b+32;
		            if(b>=97&&b<=122)
		                b=b-32;
		      s=s+Character.toString ((char)b);
		       
		    }
		}
		System.out.println(t);
	}
}


