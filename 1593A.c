#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d", &n);

    for(int i=1;i<=n;i++)
    {
        int ar[3];
        scanf("%d %d %d", &ar[0], &ar[1], &ar[2]);

        int max = (ar[0]>ar[1])?((ar[0]>ar[2])?ar[0]:ar[2]):((ar[1]>ar[2])?ar[1]:ar[2]);

        if(ar[0] == ar[1] && ar[1] == ar[2])
        {
            ar[0]++;
            ar[1]++;
            ar[2]++;
            printf("%d %d %d\n", ar[0],ar[1],ar[2]);
            continue;
        }

        if(ar[0] == ar[1] && ar[0] == max)
        {
            ar[0] = max-ar[0]+1;
            ar[1] = max-ar[1]+1;
            ar[2] = max-ar[2]+1;
        }
        else if(ar[0] == ar[2] && ar[0] == max)
        {
            ar[0] = max-ar[0]+1;
            ar[1] = max-ar[1]+1;
            ar[2] = max-ar[2]+1;
        }
        else if(ar[1] == ar[2] && ar[1] == max)
        {
            ar[0] = max-ar[0]+1;
            ar[1] = max-ar[1]+1;
            ar[2] = max-ar[2]+1;
        }

        else if(ar[0] == max)
        {
            ar[0] = 0;
            ar[1] = max-ar[1]+1;
            ar[2] = max-ar[2]+1;
        }

        else if(ar[1] == max)
        {
            ar[0] = max-ar[0]+1;
            ar[1] = 0;
            ar[2] = max-ar[2]+1;
        }

        else if(ar[2] == max)
        {
            ar[0] = max-ar[0]+1;
            ar[1] = max-ar[1]+1;
            ar[2] = 0;
        }

        printf("%d %d %d\n", ar[0],ar[1],ar[2]);
    }
}