import java.util.Scanner;
class Fibonacci{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int p=0;
int b=1;
System.out.print(p+" ");
System.out.print(b+" ");
int count =2;
while(count<=n)
{
int  temp =b;
b=p+b;
p=temp;
count++;	
System.out.print(b+" ");
}

}

}