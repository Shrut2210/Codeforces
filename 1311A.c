#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d", &n);

    for(i=1;i<=n;i++)
    {
        int ar[2];
        int ans = 0;
        scanf("%d %d", &ar[0],&ar[1]);

        if(ar[0] == ar[1])
        {
            printf("0\n");
            continue;
        }

        if(ar[0]>ar[1])
        {
            int x = ar[0]-ar[1];
            ans++;
            if(x%2 != 0)
            {
                ans++;
            }
        }

        else if (ar[0]<ar[1])
        {
            int x = ar[1]-ar[0];
            ans++;
            if(x%2 == 0)
            {
                ans++;
            }
        }

        printf("%d\n", ans);
    }
}