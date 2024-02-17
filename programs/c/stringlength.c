#include<stdio.h>
#include<conio.h>
main(){
        char s[30];
        int i;
        printf("Enter string to find length:-\n");
        gets(s);
        for(i=1;s[i]!='\0';i++){}
        printf("%d",i);
        getch();
}
