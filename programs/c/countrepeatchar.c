#include<stdio.h>
#include<conio.h>
main(){
    int i,frequency=0;
    char c;
    char s[50];
    printf("Enter String :-\n");
    gets(s);
    printf("Enter char to check count frequency:-\n");
    scanf("%c",&c);
    for(i=1;s[i] !='\0';i++){
        if(c==s[i]){
            frequency++;
        }
    }
    printf("%d",frequency);
    getch();
}
