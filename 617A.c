#include<stdio.h>
int main()
{
    int n,i,min=0;
    scanf("%d", &n);

    min = n/5;
    
    if(n%5 != 0)
    {
        min += 1;
    }
    
    printf("%d", min);
}