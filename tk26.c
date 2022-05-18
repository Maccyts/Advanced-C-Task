#include <stdio.h>
int i,a[100],n,j,big;
int main()
{
    scanf("%d",&n);
    for(i=1;i<=n;i++)
        scanf("%d",&a[i]);
		big=a[1];
			for(i=1;i<=n;i++)
				if(big<a[i])
				big=a[i];
			big++;
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(a[i]==a[j])
                    a[j]=big;
            }
		 }
            for(i=1;i<=n;i++)
                if(a[i]!=big)
                printf(" %d",a[i]);
			
               
}
       
  

