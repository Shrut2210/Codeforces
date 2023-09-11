#include<stdio.h>

int main()
{
    long long n,k;
    scanf("%lld %lld", &n, &k);

    if(n%2 == 0)
    {
        n = n/2;
    }
    else
    {
        n = n/2 + 1;
    }

    if(k<=n)
    {
        printf("%lld", k*2-1);
    }
    else
    {
        printf("%lld", (k - n)*2);
    }
}