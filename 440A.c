#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);

    int arr[n-1];
    for(int i=0;i<n-1;i++)
    {
        scanf("%d", &arr[i]);
    }

    for(int i=0;i<n-1;i++)
    {
        int temp=arr[0];
        for(int j=i+1;j<n-1;j++)
        {
            if(arr[i]>arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // for(int i=0;i<n-1;i++)
    // {
    //     printf("%d ", arr[i]);
    // }
    arr[n-1] = 0;

    for(int i=0;i<n;i++)
    {
        if((i+1) != arr[i])
        {
            printf("%d", (i+1));
            return 0;
        }
    }
}