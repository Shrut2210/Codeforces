#include<stdio.h>

int main()
{
    int n,i;
    scanf("%d", &n);

    for(i=1;i<=n;i++)
    {
        int x,y,k;
        scanf("%d %d %d", &x, &y, &k);
        
        int m = k%x;

        if(m>y){
            printf("%d\n", (k-m+y));
        }
        else if(m<y)
        {
            printf("%d\n", (k-m-x+y));
        }
        else
        {
            printf("%d\n", k);
        }
    }
}