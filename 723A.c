#include<stdio.h>
#include<math.h>

int main()
{
    int a,b,c,sum,mid;
    scanf("%d %d %d", &a,&b,&c);

    mid = (a>b)?((a>c && c>b)?c:b):((b>c && c>a)?c:a);

    sum = abs(mid-a)+abs(mid-b)+abs(mid-c);
    printf("%d", sum);
}