#include<stdio.h>
#include<string.h>

int main()
{
    int n,t,i;
    scanf("%d %d", &n, &t);

    char str[n+1],x;
    scanf(" %s", str);

    for(i=1;i<=t;i++)
    {
        for(int j = 0 ; j < n ; j++)
        {
            if(str[j] == 'B' && str[j+1] == 'G')
            {
                x = str[j];
                str[j] = str[j+1];
                str[j+1] = x;
            }
        }
    }

    printf("%s", str);
}