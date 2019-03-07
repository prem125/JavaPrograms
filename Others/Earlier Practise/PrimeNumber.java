class Prime
{
public static void main(String[] args)
{
int n=19, count=2;
for(int i=2; i<=n/2;i++)
{
if(n%i==0)
break;
}
if(count==2)
System.out.println("Prime Number");
else
System.out.println("Not Prime Number");
}
}