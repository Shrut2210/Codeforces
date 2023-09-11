#include<stdio.h>
#include<string.h>
int main()
{
    int t;
    scanf("%d", &t);

    for(int i=0;i<t;i++)
    {
        char c;
        scanf(" %c", &c);
        int flag = 0;

        char str[] = "codeforces";

        for(int j=0;j<10;j++)
        {
            if(c == str[j])
            {
                printf("YES\n");
                break;
            }
            else
            {
                flag++;
            }
        }

        if(flag == 10)
        {
            printf("NO\n");
        }
    }
}