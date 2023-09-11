#include<stdio.h>

int main()
{
    long long n,m;
    scanf("%lld %lld", &n, &m);
    long long count=0;

    if(n == m)
    {
        printf("0");
    }
    else if(m%n != 0)
    {
        printf("-1");
    }
    else
    {
        long long d = m/n;

        while(d%2 == 0)
        {
            d = d/2;
            count++;
        }

        while(d%3 == 0)
        {
            d = d/3;
            count++;
        }

        if(d != 1)
        {
            printf("-1");
        }
        else
        {
            printf("%lld", count);
        }
    }
}