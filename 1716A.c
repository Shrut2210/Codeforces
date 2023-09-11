#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    for(int i=1;i<=n;i++)
    {
        int x;
        scanf("%d", &x);

        if(x%3 == 0)
        {
            printf("%d\n", (x/3));
        }
        else if(x%2 == 0)
        {
            printf("%d\n", (x/2));
        }
        else
        {
            x 
        }
    }
}