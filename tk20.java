import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int one=0;
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        if(a[i]==1)
	            one++;
	    }
	     int t=0;
	    for(int i=0;i<n-one;i++)
	        a[t++]=0;
	   for(int i=0;i<one;i++)
	        a[t++]=1;
	   for(int i=0;i<n;i++)
	     System.out.print(a[i]+" ");
	}
}


