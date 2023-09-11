#include<stdio.h>

int main()
{
    int n,i,j=0;
    scanf("%d", &n);

    for(i=1;i<=n;i++)
    {
        int ar[2];
        scanf("%d %d", &ar[j], &ar[j+1]);

        if(ar[j]%ar[j+1] == 0)
        {
            printf("0\n");
        }
        else
        {
            printf("%d\n", ar[j+1]-(ar[j]%ar[j+1]));
        }
    }
}