#include <stdio.h>
int i,n,r,a[100];
int main()
{
    scanf("%d",&n);
    for(i=1;i<=n;scanf("%d",&a[i++]));
        scanf("%d",&r);
            for(i=1;i<=n;i++)
            {
                if(a[i]==r)
                {
                    printf("%d",i);
                    break;
                }
            }
}


