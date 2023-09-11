#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);

    int arr[n][n];
    int cmd=0,csd=0,cmv=0,cmh=0,sum=0;

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d", &arr[i][j]);

            if((i+j)==(n-1))
            {
                sum += arr[i][j];
            }
            else if(i == j)
            {
                sum += arr[i][j];
            }
            else if(i == n/2)
            {
                sum += arr[i][j];
            }
            else if(j == n/2)
            {
                sum += arr[i][j];
            }
        }
    }

    printf("%d", sum);
}