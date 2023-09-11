#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);

    for(int i=1;i<=n;i++)
    {
        int a,b,c;
        scanf("%d %d %d", &a, &b, &c);

        int mid = (a>=b && a>=c)?((b>=c)?b:c):((b>=a && b>=c)?((a>=c)?a:c):((a>=b)?a:b));

        printf("%d\n", mid);
    }
}