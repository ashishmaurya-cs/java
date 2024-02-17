#include<stdio.h>
#include<conio.h>

void main()
{

int a,b,add,sub,mul,div,ch;
clrscr();
printf("1:for addition\n");  
printf("2:for Subtraction\n");
printf("3:for multiplication\n");
printf("4:for division\n");
printf("5:for exit\n");

printf("enter your choice \n");
scanf("%d",ch);

switch(ch){

	case 1:{

		printf("Enter two number \n");
		scanf("%d%d",&a,&b);
		add = a+b;
		printf("addition of %d and %d is %d\n",a,b,add );
	}

	case 2:{

		printf("Enter two number \n");
		scanf("%d%d",&a,&b);
		sub = a-b;
		printf("Subtraction of %d and %d is %d\n",a,b,sub );
	}

	case 3:{

		printf("Enter two number \n");
		scanf("%d%d",&a,&b);
		mul = a*b;
		printf("multiplication of %d and %d is %d\n",a,b,mul );
	}

	case 4:{

		printf("Enter two number \n");
		scanf("%d%d",&a,&b);
		div = a/b;
		printf("division of %d and %d is %d\n",a,b,div );
	}

	case 5:{

	exit(0);
	}

	default :{

		printf("Wrong choice\n");
	}

}
getch();
}
