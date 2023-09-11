#include <stdio.h>
#include <string.h>

int main()
{
    char str[101];
    int j, i, a, max = 0;
    scanf("%s", str);

    int len = strlen(str);

    // for (i = 0; i < len; i++)
    // {
    //     if (str[i] > max)
    //     {
    //         max = str[i];
    //     }
    // }

    for (i = 0; i < len; i = i + 2)
    {
        for (j = i + 2; j < len; j = j + 2)
        {
            if (str[i] > str[j])
            {
                a = str[i];
                str[i] = str[j];
                str[j] = a;
            }
        }
    }

    for (i = 0; i < len; i++)
    {
        if (i % 2 == 0)
        {
            printf("%c", str[i]);
        }
        else
        {
            printf("+");
        }
    }
}