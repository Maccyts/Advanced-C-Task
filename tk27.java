import java.util.*;
import java.lang.*;
public class Main
{
    static boolean pali(String s)
    {
        String r="";
        boolean f=false;
        for(int i=0;i<s.length();i++)
            r=s.charAt(i)+r;
        if(r.equals(s))
            f=true;
        return f;

    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean f=false;
		for(int i=0;i<s.length();i++)
		{
		    String t="";
		    for(int j=0;j<s.length() ;j++)
		    {
		        if(i!=j)
		            t=t+s.charAt(i);
		    }
		    if(pali(t))
		    {
		        f=true;
		        break;
		    }
		}
		  if(f) 
		    System.out.print("Yes");
		    else
		        System.out.print("No");
	}
}


