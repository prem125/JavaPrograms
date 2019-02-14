class Prime
{
public static void main(String[] args)
{
int n=20, count=2;
for(int i=2; i<=(n-1);i++)
{
if(n%i==0)
{
count++;
break;
}
}
if(count==2)
System.out.println("Prime Number");
else
System.out.println("Not Prime Number");
}
}