#include<stdio.h>
#include<string.h>

int main()
{
    char str[101];
    scanf("%s", str);
    int i=0;
    while(str[i] != '\0')
    {
        if(str[i] >= 65 && str[i] <= 90)
        {
            str[i] += 32;
        }
        i++;
    }
    
    i=0;
    while(str[i] != '\0')
    {
        if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'y')
        {
            i++;
        }

        else
        {
            printf(".");
            printf("%c", str[i]);
            i++;
        }
    }
}