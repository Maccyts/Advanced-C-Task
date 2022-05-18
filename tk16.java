import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n+1];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	        int index=sc.nextInt()-1;
	        int el=sc.nextInt();
	        int t=0,i;
	   for(i=index;i<n;i++)
	   {
	       t=a[i];
	       a[i]=el;
	       el=t;
	       
	   }
	   a[i]=el;
	   for(i=0;i<=n;i++)
	        System.out.print(a[i]+" ");
	}
}



