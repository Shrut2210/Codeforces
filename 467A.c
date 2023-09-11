#include<stdio.h>

int main()
{
    int n,j=0,count=0;
    scanf("%d", &n);

    for(int i = 1 ; i <= n ; i++)
    {
        int ar[2];
        scanf("%d %d", &ar[j], &ar[j+1]);

        if(ar[j+1] - ar[j] >= 2)
        {
            count++;
        }
    }

    printf("%d", count);
}