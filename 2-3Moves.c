#include<stdio.h>
#include<math.h>

int main()
{
    long t;
    scanf("%ld", &t);

    for(long i=0;i<t;i++)
    {
        long n,total=0;
        scanf("%ld", &n);

        if(n == 1 || n == -1)
        {
            total = 2;
        }
        else if(n == 0)
        {
            total = 0;
        }
        else if(n%3 == 0)
        {
            total = abs(n/3);
        }
        else
        {
            total = abs(n/3)+1;
        }

        printf("%ld\n", total);
    }
}