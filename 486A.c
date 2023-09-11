#include<stdio.h>

int main()
{
    long long int n,sum=0;
    scanf("%lld", &n);

    if(n%2==0)
    {
        printf("%lld", n/2);
    }
    else if(n%2==1)
    {
        printf("%lld", -(((n+1)/2)));
    }

    
}