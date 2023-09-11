#include<stdio.h>
#include<math.h>

int main()
{
    int n;
    scanf("%d", &n);

    for(int i=1;i<=n;i++)
    {
        int a,b,c;
        scanf("%d %d %d", &a, &b, &c);

        int x = 2*c - b;
        
        if(b>c)
        {
            x=b;
        }

        if(a<x)
        {
            printf("1\n");
        }
        else if (a>x)
        {
            printf("2\n");
        }
        else
        {
            printf("3\n");
        }
        

        // if(a==1)
        // {
        //     printf("1\n");
        // }
        // else if(b==1)
        // {
        //     b = abs(c-b) + (c-1);
        //     a = a-1;
        //     if(b<a)
        //     {
        //         printf("2\n");
        //     }
        //     else if (a<b)
        //     {
        //         printf("1\n");
        //     }
        //     else
        //     {
        //         printf("3\n");
        //     }
        // }
        // else
        // {
        //     a = a-1;
        //     b = abs(c-b);
        //     if(b<a)
        //     {
        //         printf("2\n");
        //     }
        //     else if (a<b)
        //     {
        //         printf("1\n");
        //     }
        //     else
        //     {
        //         printf("3\n");
        //     }
        }
    }