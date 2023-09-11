#include<stdio.h>
#include<string.h>

int main()
{
    char str[101],i,count=0;
    scanf("%s", str);

    if(strlen(str)%2==0)
    {
        printf("CHAT WITH HER!");
    }

    else
    {
        printf("IGNORE HIM!");
    }
}