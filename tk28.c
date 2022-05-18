#include <stdio.h>
int f=1,n,i,j,a[100],d,diff;
int main()
{
    scanf("%d",&n);
    for(i=1;i<=n;scanf("%d",&a[i++]));
        d=a[1]>a[2]?a[1]-a[2]:a[2]-a[1];
            for(i=1;i<n;i++)
            {
                diff=a[i]>a[i+1]?a[i]-a[i+1]:a[i+1]-a[i];
                    if(diff!=d)
                    {
                        f=0;
                        break;
                    }
            }
            if(f) printf("True");
            else printf("False");
}

