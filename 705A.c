#include<stdio.h>

int main()
{
    int n,i;
    scanf("%d", &n);

    for(i=1;i<=n;i++)
    {
        if(i%2==0)
        {
            if(i==n)
            {
                printf("I love ");
                continue;
            }
            else
            {
                printf("I love ");
            }
        }
        else
        {
            if(i==n)
            {
                printf("I hate ");
                continue;
            }
            else
            {
                printf("I hate ");
            }
        }

        printf("that ");
    }

    printf("it");
}