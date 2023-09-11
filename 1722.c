#include<stdio.h>
#include<string.h>

int main()
{
    int n;
    scanf("%d", &n);
    char strfinal[5] = "Timur";

    for(int i=1;i<=n;i++)
    {
        int l;
        scanf("%d", &l);
        char str[l];
        scanf(" %s", str);
        int count = 0;

        for(int j=0;j<5;j++)
        {
            for(int k=0;k<l;k++)
            {
                if(strfinal[j]==str[k])
                {
                    count++;
                    break;
                }
            }
        }

        if(count == 5 && l==5)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
}