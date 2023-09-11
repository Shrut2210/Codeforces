#include <stdio.h>
#include <string.h>

int main()
{
	char str1[101], str2[101];
	scanf("%s", str1);
	scanf("%s", str2);

	for (int i = 0; i < strlen(str1); i++)
	{
		if (str1[i] >= 65 && str1[i] <= 90)
		{
			str1[i] = str1[i] + 32;
		}

		else
		{
			continue;
		}
	}

	for (int i = 0; i < strlen(str2); i++)
	{
		if (str2[i] >= 65 && str2[i] <= 90)
		{
			str2[i] = str2[i] + 32;
		}

		else
		{
			continue;
		}
	}

	int x = strcmp(str1, str2);

	if (x > 0)
	{
		printf("1");
	}
	else if (x < 0)
	{
		printf("-1");
	}
	else
	{
		printf("0");
	}
}