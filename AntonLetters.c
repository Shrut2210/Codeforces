#include<stdio.h>
#include<string.h>
int main()
{
    char str[1001];

    gets(str);

    int dis = 0;
    int flag = 0;
    int cha = 0;

    for(int i=0;i<strlen(str);i++)
    {
        if(str[i] >= 'a' && str[i] <= 'z')
        {
            cha++;
        }
    }

    for(int i=1;i<strlen(str);i+=3)
    {
        flag = 0;
        for(int j=i+3;j<strlen(str) && flag == 0;j+=3)
        {
            if(str[i] == str[j])
            {
                dis++;
                flag = 1;
            }
        }
    }

    if(strlen(str) == 2)
    {
        printf("0");
    }
    else
    {
        printf("%d", (cha-dis));
    }
}