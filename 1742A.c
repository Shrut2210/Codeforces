#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d", &n);

    for(i=1;i<=n;i++)
    {
        int a,b,c;
        scanf("%d %d %d", &a, &b, &c);

        if(a==(b+c) || b==(a+c) || c==(a+b))
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
}