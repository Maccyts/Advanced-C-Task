import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] t=s.split(" ");
		String f=sc.nextLine();
		String r=sc.nextLine();
		String res="";
		int i=0;
		for(String x:t)
		{
		    if(x.equals(f))
		    {
		        i++;
		        if(i%2==0)
		            res=res+r+" ";
		        else 
		            res=res+x+" ";
		    }
		    else 
		    {
		        res=res+x+" ";
		    }
		}
		System.out.println(res);
	}
}
