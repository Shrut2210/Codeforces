#include<stdio.h>
#include<math.h>
int main()
{
    int n,c;
    scanf("%d %d", &n, &c);

    int arr1[n],arr2[n];
    int lim=0,sam=0,timelim=0,timesam=0,sumn=0,sumnd=0;

    for(int i=0;i<n;i++)
    {
        scanf("%d", &arr1[i]);
    }

    for(int i=0;i<n;i++)
    {
        scanf("%d", &arr2[i]);
    }

    for(int i=0,j=n-1;i<n && j>=0;i++,j--)
    {
        timelim += arr2[i];
        timesam += arr2[j];

        lim += max(0,(arr1[i] - c*timelim));
        sam += max(0,(arr1[j] - c*timesam));
    }

    if(lim>sam)
    {
        printf("Limak");
    }
    else if(lim<sam)
    {
        printf("Radewoosh");
    }
    else
    {
        printf("Tie");
    }
}