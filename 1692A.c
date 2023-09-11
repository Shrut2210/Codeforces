#include<stdio.h>
int main()
{
    int n,i,count=0;
    scanf("%d", &n);
    for( i=1;i<=n;i++)
    {
        count =0 ;
        int a,b,c,d;
        scanf("%d %d %d %d", &a, &b, &c, &d);

        if(a<=b)
        {
            count++;
        }
        if(a<=c)
        {
            count++;
        }
        if(a<=d)
        {
            count++;
        }

        printf("%d\n", count);
    }
}