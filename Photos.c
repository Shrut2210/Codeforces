#include<stdio.h>

int main()
{
	int n,m;
	scanf("%d %d", &n,&m);
	int count = 0;

	char str[n][m];

	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			scanf(" %c", &str[i][j]);

			if(str[i][j] == 'C' || str[i][j] == 'M' || str[i][j] == 'Y')
			{
				count++;
			}
		}
	}

	if(count>0)
	{
		printf("#Color");
	}
	else
	{
		printf("#Black&White");
	}
}