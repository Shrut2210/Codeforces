#include<stdio.h>

int main()
{
    int k,n,w,i,sum=0;
    scanf("%d %d %d", &k, &n, &w);

    for(i=1;i<=w;i++)
    {
        sum = sum + (k*i);
    }

    if(sum>n)
    {
        printf("%d", sum-n);
    }
    else
    {
        printf("0");
    }
}