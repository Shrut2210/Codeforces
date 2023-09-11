#include<stdio.h>

int main()
{
    int n,i,sum=0;
    scanf("%d", &n);

    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d", &ar[i]);
    }

    for(i=0;i<n;i++)
    {
        if(ar[i]!=ar[i+1])
        {
            if((i+1)==n)
            {
                sum += 0;
            }
            else
            {
                sum += 1;
            }
        }
    }
    
    if(n==1)
    {
        printf("1");
    }
    else
    {
        printf("%d", sum+1);
    }
}