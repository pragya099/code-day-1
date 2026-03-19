import java.util.Scanner;

class Calculator
{
public static void main(String []args)
{
	int res=0;
	while(true)
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter any operator");
int op=sc.next().trim().charAt(0);
if(op=='+' || op=='-' ||op=='*' ||op=='%' || op=='/' || op=='X' ||op=='x')

System.out.println("enter any two number:");
int num1=sc.nextInt();
int num2=sc.nextInt();


if(op=='+')
{
 res=num1+num2;
System.out.print("addition of two num"+res);
}
if(op=='-')
{
if(num2>num1)
{
 res=num2-num1;
System.out.print("subtraction of two num"+res);
}
else
{
res =num1-num2;
System.out.print("Subtratcion of two num"+res);
}
}
if(op=='*')
{
	res=num1*num2;
	System.out.print("product of two num"+res);
}
if(op=='/')
{
	if(num1>num2)
	{
		if(num2!=0 || num1==num2)
		{
			System.out.println(res=num1/num2);
		}
	}
	if(num2>num1)
	{
		if(num1!=0 || num1==num2)
		{
			System.out.println(res=num2/num1);
		}
	}
}

if(op=='%')
{
	if(num1>num2 || num1==num2)
	{
		if(num2!=0 ||num1==num2)
		{
			System.out.println(res=num1%num2);
		}
	}
	if(num2>num1||num1==num2)
	{
		if(num1!=0)
		{
			System.out.println(res=num2%num1);
		}
	}
	if(op=='x' ||op=='X')
	{
		break;
	}
else{
	System.out.print("invalid input");
}
}
}

}
}
