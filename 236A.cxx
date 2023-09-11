#include<stdio.h>
#include<string.h>

int main()
{
	char str[101];
	scanf("%s", str);
	
	int i,j,flag=0,count=0;
	int len = strlen(str);
	
	for(i=0;str[i]!='\0';i++)
	{
		for(j=i-1;j>=0;j--)
		{
			if(str[i]==str[j]){
				flag=1;
				break;
			}
		}
		if(flag==0){
			count++;
		}
		flag=0;
	}
	
	if(count%2==0)
	{
		printf("CHAT WITH HER!");
	}
	else
	{
		printf("IGNORE HIM!");
	}
}