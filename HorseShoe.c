#include<stdio.h>
int main()
{
    int arr[4];
    for(int i=0;i<4;i++)
    {
        scanf("%d", &arr[i]);
    }

    int dis = 0;
    int flag = 1;

    for(int i=0;i<4;i++)
    {
        flag = 1;
        for(int j=i+1;j<4 && flag == 1;j++)
        {
            if(arr[i] == arr[j])
            {
                dis++;
                flag = 0;
            }
        }
    }

    printf("%d", dis);
}