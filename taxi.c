#include<stdio.h>
#include<math.h>

int main()
{
    int n;
    scanf("%d", &n);

    int arr[n], sum=0,sum1=0,sum2=0,sum4=0,sum3=0;
    for(int i=0;i<n;i++)
    {
        scanf("%d", &arr[i]);
        sum = sum + arr[i];
        if(arr[i] == 1)
        {
            sum1 ++;
        }
        if(arr[i] == 4)
        {
            sum4++;
        }
        if(arr[i] == 2)
        {
            sum2 ++;
        }
        if(arr[i] == 3)
        {
            sum3++;
        }
    }

    sum = sum4 + sum3 + sum2/2;
    sum1 = (sum1 - sum3);

    if(sum2%2 == 1)
    {
        sum++;
        sum1 -= 2;
    }

    if(sum1 > 0)
    {
        sum += (sum1+3)/4;
    }

    printf("%d", sum);
}