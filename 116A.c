#include<stdio.h>

int main()
{
    int n,i,sum=0,max=0;
    scanf("%d", &n);

    for(int j = 1; j <= n ; j++)
    {
        int ar[2];
        for(i=0;i<2;i++)
        {
            scanf("%d", &ar[i]);

            if(i == 0)
            {
                sum = sum - ar[i];
            }
            else
            {
                sum = sum + ar[i];
            }
        }

        if(sum>max)
        {
            max = sum;
        }
    }

    printf("%d",max);
}