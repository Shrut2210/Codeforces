#include<stdio.h>

int main()
{
    int n, i, k;
    scanf("%d %d", &n, &k);

    for(i=1;i<=k;i++)
    {
        if(n%10!=0)
        {
            n--;
        }
        else
        {
            n = n/10;
        }
    }

    printf("%d", n);
}