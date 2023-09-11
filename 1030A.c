#include<stdio.h>

int main()
{
    int n,i,flag=0;
    scanf("%d", &n);

    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d", &ar[i]);

        if(ar[i]==0)
        {
            flag=0;
        }
        else 
        {
            flag=1;
            break;
        }
    }

    if(flag==0)
    {
        printf("EASY");
    }

    else
    {
        printf("HARD");
    }
}