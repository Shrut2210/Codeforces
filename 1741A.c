#include<stdio.h>
#include<string.h>

int main()
{
    int n;
    scanf("%d", &n);

    for(int i=0;i<n;i++)
    {
        char str1[51],str2[51];
        scanf(" %s %s", str1,str2);

        if(str1[strlen(str1)-1] == str2[strlen(str2)-1])
        {
            if(strlen(str1) > strlen(str2))
            {
                if(str1[strlen(str1)-1] == 'S')
                {
                    printf("<\n");
                    continue;
                }
                else if(str1[strlen(str1)-1] == 'M' || str1[strlen(str1)-1] == 'L')
                {
                    printf(">\n");
                    continue;
                }
            }
            else if(strlen(str1) < strlen(str2))
            {
                if(str1[strlen(str1)-1] == 'S')
                {
                    printf(">\n");
                    continue;
                }
                else if(str1[strlen(str1)-1] == 'M' || str1[strlen(str1)-1] == 'L')
                {
                    printf("<\n");
                    continue;
                }
            }
            else 
            {
                printf("=\n");
                continue;
            }  
        }
        else if(str1[strlen(str1)-1] == 'M' && str2[strlen(str2)-1] == 'L' || str1[strlen(str1)-1] == 'S' && str2[strlen(str2)-1] == 'M' || str2[strlen(str2)-1] == 'L')
            {
                printf("<\n");
                continue;
            }
        else if(str1[strlen(str1)-1] == 'L' && str2[strlen(str2)-1] == 'M' || str1[strlen(str1)-1] == 'L' && str2[strlen(str2)-1] == 'M' || str2[strlen(str2)-1] == 'S')
        {
            printf(">\n");
        }

    }
}