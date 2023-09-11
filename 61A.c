#include<stdio.h>
#include<string.h>

int main()
{
    char ar1[101], ar2[101],i;
    scanf("%s", ar1);
    scanf("%s", ar2);

    for(i=0;i<strlen(ar1);i++)
    {
        if(ar1[i] == ar2[i])
        {
            printf("0");
        }
        else
        {
            printf("1");
        }
    }
}