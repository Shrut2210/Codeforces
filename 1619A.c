#include<stdio.h>
#include<string.h>
int main()
{
    int n,count;
    scanf("%d", &n);

    for(int i=1;i<=n;i++)
    {
        count=0;
        char s[100];
        scanf(" %s", s);

        for(int j=0,k=((strlen(s)/2)-1);j<(strlen(s)/2),k<strlen(s);j++,k++)
        {
            if(s[j] == s[k])
            {
                count++;
            }
        }
        if(count == (strlen(s)/2))
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
}