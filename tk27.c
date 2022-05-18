#include <stdio.h>
int rev(int n)
{
    int s=0;
    while(n)
    {
        s=s*10+n%10;
        n=n/10;
    }
    return s;
}
int main()
{
    int i,j,a[100],n;
    scanf("%d",&n);
    for(i=1;i<=n;scanf("%d",&a[i++]));
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
                if(rev(a[i])>rev(a[j]))
                a[i]=a[i]+a[j]-(a[j]=a[i]);
        }
            for(i=1;i<=n;i++)
                printf("%d ",a[i]);
}
    


