#include<stdio.h>
#include<string.h>

int main()
{
    char string[201];
    scanf("%s", string);

    int i=0;
    // int a=0,count=0,j=0,spacecount=0;
    

    // while(string[j] != '\0')
    // {
    //     if(string[j] == 'W' && string[j+1] == 'U' && string[j+2] == 'B')
    //     {
    //         count++;
    //         j+=3;
    //     }
    //     else
    //     {
    //         if(string[j+1] == 'W' && string[j+2] == 'U' && string[j+3] == 'B')
    //         {
    //             spacecount++;
    //             j++;
    //         }
    //         else
    //         {
    //             j++;
    //         }
    //     }
    // }

    // char stringfinal[strlen(string)-(3*count)+spacecount-1];

    while(string[i] != '\0'){
        if(string[i] == 'W' && string[i+1] == 'U' && string[i+2] == 'B')
        {
            i+=3;
            printf(" ");
        }
        else
        {
            printf("%c", string[i]);
            i++;
            // if(string[i+1] == 'W' && string[i+2] == 'U' && string[i+3] == 'B')
            // {
            //     stringfinal[a] = string[i];
            //     stringfinal[a+1] = ' ';
            //     a+=2;
            //     i++;
            // }
            // else
            // {
            //     stringfinal[a] = string[i];
            //     a++;
            //     i++;
            // }
        }
    }

    // printf("%s", stringfinal);
}