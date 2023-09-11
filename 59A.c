#include <stdio.h>
#include <string.h>

int main()
{
    char str[101];
    scanf("%s", str);

    int ln = 0, un = 0;

    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] >= 65 && str[i] <= 90)
        {
            un++;
        }

        else if (str[i] >= 97 && str[i] <= 122)
        {
            ln++;
        }
    }

    if (un > ln)
    {
        for (int i = 0; i < strlen(str); i++)
        {
            if (str[i] >= 97 && str[i] <= 122)
            {
                str[i] = str[i] - 32;
            }

            else
            {
                continue;
            }
        }
    }
    else
    {
        for (int i = 0; i < strlen(str); i++)
        {
            if (str[i] >= 65 && str[i] <= 90)
            {
                str[i] = str[i] + 32;
            }

            else
            {
                continue;
            }
        }
    }

    printf("%s", str);
}