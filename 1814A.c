#include<stdio.h>
int main()
{
    int t;
    scanf("%d", &t);

    for(int i=1;i<=t;i++)
    {
        int n,k;
        scanf("%d %d", &n, &k);

        if((k+2)%n == 0 || n/k == 1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}