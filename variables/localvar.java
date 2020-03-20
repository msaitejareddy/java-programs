class Test
{
public static void main(String[] args)
{
int i=100;
if(1==1)
{
int j=200;
System.out.println(i + j);
}
		// error because j is local to if block only System.out.println(i + j);
}
}
