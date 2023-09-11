#include<stdio.h>
int main()
{
    int n,i,sum1=0,sum2=0;
    scanf("%d", &n);

    for(i=0;i<n;i++)
    {
        char a[6];
        scanf("%s", a);
        sum1=0;
        sum2=0;

        sum1 = (int)a[0]+(int)a[1]+(int)a[2];
        sum2 = (int)a[3]+(int)a[4]+(int)a[5];


        if(sum1 == sum2)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
}