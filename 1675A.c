#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);

    for(int i=0;i<n;i++)
    {
        int a,b,c,x,y,count=0;
        scanf("%d %d %d %d %d" , &a, &b, &c, &x, &y);

        if(x>a)
        {
            count += (x-a);
        }
        if(y>b)
        {
            count += (y-b);
        }

        if(count <= c)
        {
            printf("yes\n");
        }
        else
        {
            printf("no\n");
        }
    }
}