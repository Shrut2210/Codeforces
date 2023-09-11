#include<stdio.h>

int main()
{
    int t;
    scanf("%d", &t);

    int a=0,b=0,c=0;
    int arr[t][3];

    for(int i=0;i<t;i++)
    {
        for(int j=0;j<3;j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    for(int i=0,j=0; i<t && j==0 ; i++)
    {
        a += arr[i][j];
    }
    for(int i=0,j=1; i<t && j==1 ; i++)
    {
        b += arr[i][j];
    }
    for(int i=0,j=2; i<t && j==2 ; i++)
    {
        c += arr[i][j];
    }

    if(a == 0 && b == 0 && c == 0)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
    
}