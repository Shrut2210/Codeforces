#include<stdio.h>
#include<string.h>

int main()
{
    int n,sum;
    scanf("%d", &n);

    
    sum=0;
    for(int i=0;i<n;i++)
    {
        char str[4];
        scanf("%s", str);

        if(str[1]=='+' || str[2]=='+')
        {
            sum++;
        }
        else if(str[1]=='-' || str[2]=='-')
        {
           sum--;
        }
        else if(str[0]=='+' || str[1]=='+')
        {
           ++sum;
        }
        else if(str[0]=='-' || str[1]=='-')
        {
            --sum;
        }
    }

    printf("%d", sum);
}