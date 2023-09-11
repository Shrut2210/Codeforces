#include<stdio.h>

int main()
{
	int tn,i,j,count=0,flag=0;
	scanf("%d", &tn);
	
	for(i=1;i<=tn;i++)
	{
		count=0;
		int ar[3];
		for(j=0;j<3;j++)
		{
			scanf("%d", &ar[j]);
			
			if(ar[j]==1)
			{
				count++;
			}
		}
		
		if(count>1)
		{
			flag++;
		}
	}
	printf("%d", flag);
}
		