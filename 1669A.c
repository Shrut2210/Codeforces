#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d", &n);

    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d", &ar[i]);
        if(ar[i]>=1900)
        {
            printf("Division 1\n");
        }
        else if(ar[i]>=1600 && ar[i]<=1899)
        {
            printf("Division 2\n");
        }
        else if (ar[i]>=1400 && ar[i]<=1599)
        {
            printf("Division 3\n");
        }
        else if(ar[i]<=1399)
        {
            printf("Division 4\n");
        }
        
    }
}