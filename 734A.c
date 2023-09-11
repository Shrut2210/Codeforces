#include<stdio.h>
#include<string.h>

int main()
{
    int n,an=0,dn=0;
    scanf("%d", &n);
    char str[n+1];
    scanf(" %s", str);

    for(int i = 0; i < n ; i++)
    {
        if(str[i] == 'A')
        {
            an++;
        }
        else if(str[i] == 'D')
        {
            dn++;
        }
    }

    if(an>dn)
    {
        printf("Anton");
    }
    else if(dn>an)
    {
        printf("Danik");
    }
    else
    {
        printf("Friendship");
    }
}