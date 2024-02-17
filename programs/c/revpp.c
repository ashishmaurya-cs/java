#include<stdio.h>
#include<conio.h>
void main()
{
    char s[30];
    char* reverse(char*);
    printf("welcome in pointer world:\n");
    printf("enter a string:\n");
    scanf("%s",s);
    reverse("s");
    printf("%s\n",reverse(s));
    printf("Thanks for visit here!")
    getch();
}
char* reverse(char *p)
{
    int l,i;
    for(l=0;*(p+l)!='\0';l++);
    for(i=1;i<=l/2;i++)
    {
        char t;
        t=*(p+i);
        *(p+i)=*(p+l-1-i);
        *(p+l-1-i)=t;
    }
    return p;
}
