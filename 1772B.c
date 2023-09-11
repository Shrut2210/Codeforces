#include<stdio.h>

void main()
{
    int i,j,n,x,y,w;
    scanf("%d", &n);
    int a = n;

    for(n=1;n<=a;n++)
    {
        int matrix[2][2];
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                scanf("%d", &matrix[i][j]);
            }
        }

        if(matrix[0][0]<=matrix[0][1] && matrix[0][0]<=matrix[1][0] && matrix[0][1]<=matrix[1][1] && matrix[1][0]<=matrix[1][1])
        {
            printf("YES\n");
        }
        else
        {
            x=matrix[0][0];
            matrix[0][0]=matrix[1][0];
            matrix[1][0]=matrix[1][1];
            matrix[1][1]=matrix[0][1];
            matrix[0][1]=x;

            if(matrix[0][0]<=matrix[0][1] && matrix[0][0]<=matrix[1][0] && matrix[0][1]<=matrix[1][1] && matrix[1][0]<=matrix[1][1])
            {
                printf("YES\n");
            }

            else
            {
                y=matrix[0][0];
                matrix[0][0]=matrix[1][0];
                matrix[1][0]=matrix[1][1];
                matrix[1][1]=matrix[0][1];
                matrix[0][1]=y;

                if(matrix[0][0]<=matrix[0][1] && matrix[0][0]<=matrix[1][0] && matrix[0][1]<=matrix[1][1] && matrix[1][0]<=matrix[1][1])
                {
                    printf("YES\n");
                }

                else
                {
                    w=matrix[0][0];
                    matrix[0][0]=matrix[1][0];
                    matrix[1][0]=matrix[1][1];
                    matrix[1][1]=matrix[0][1];
                    matrix[0][1]=w;

                    if(matrix[0][0]<=matrix[0][1] && matrix[0][0]<=matrix[1][0] && matrix[0][1]<=matrix[1][1] && matrix[1][0]<=matrix[1][1])
                    {
                        printf("YES\n");
                    }

                    else
                    {
                        printf("NO\n");
                    }
                }
            }
        }
    }
}