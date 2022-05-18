import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            int f=0;
	            for(int j=i+1;j<n;j++)
	            {
	                if(a[i]<a[j])
	                {
	                    f=1;
	                    break;
	                }
	                   
	            }
	       if(f==0) System.out.print(a[i]+" ");
	       }
	       
		
	}
}

