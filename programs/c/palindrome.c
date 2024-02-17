#include<stdio.h>
#include<conio.h>

void main()
{

    char str[30];
    int j,l;
    printf("enter string:\n");
    gets(str);

    l=strlen(str);
    for(j=0;j<l/2;j++)
    {
        if(str[j]!=str[l-1-j])
            {
            printf("this is not a palindrome:\n");
                  break;
            }

    }
    if(j==l/2)

       printf("this is a palindrome:\n");

getch();
}
