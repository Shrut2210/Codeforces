#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int arr[7];
    int sum = 0;
    int flag = 1;

    for(int i=0;i<7;i++)
    {
        scanf("%d", &arr[i]);

        sum += arr[i];

        if(sum>=n)
        {
            printf("%d", (i+1));
        }
    }
}