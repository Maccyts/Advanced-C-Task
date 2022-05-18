import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	        String hex="0123456789ABCDEF";
	        for(int i=0;i<n;i++)
	        {
	            String s=" ";
	            int x=a[i];
	            while(x!=0)
	            {
	                int c=x%16;
	                s=hex.charAt(c)+s;
	                x=x/16;
	            }
	            System.out.print(s+" ");
	
	        }
		
	}
}


