#include<stdio.h>
#include<conio.h>
main(){
    char c;
    //program for check whether it is alphabet or not :-
    printf("Enter char to check whether it is alphabet or not:-\n");
    scanf("%c",&c);
    if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
        printf("it is alphabet");

    }
    else{

        printf("It is not alphabet");
    }
    getch();
}
