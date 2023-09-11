#include<stdio.h>
#include<string.h>

int main()
{
    long long int n;
    scanf("%lld", &n);

    int digit,count=0;
    while(n>0)
    {
        digit = n % 10;

        if(digit == 7 || digit == 4)
        {
            count++;
        }

        n = n/10;
    }

    if(count == 7 || count == 4)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
}