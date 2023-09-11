#include<stdio.h>
int main()
{
    int n,i,sum;
    scanf("%d", &n);

    for(i=1;i<=n;i++)
    {
        sum = 0;
        int ar[2];
        scanf("%d %d", &ar[0], &ar[1]);

        sum = (24-ar[0]-1)*60 + (60-ar[1]);

        printf("%d\n", sum);
    }
}