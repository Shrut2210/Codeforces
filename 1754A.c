#include<stdio.h>
#include<string.h>
int main()
{
    int n;
    scanf("%d", &n);

    for(int i=1;i<=n;i++)
    {
        int k;
        scanf("%d", &k);
        char str[k];
        scanf(" %s", str);

        int QC=0,AC=0;

        for(int j=0;j<strlen(str);j++)
        {
            if(str[j] == 'Q')
            {
                QC++;
            }
            else
            {
                QC--;
            }

            if(QC<=0)
            {
                QC=0;
            }
        }
            if(QC>0)
            {
                printf("No\n");
            }
            else
            {
                printf("Yes\n");
            }
    }
}