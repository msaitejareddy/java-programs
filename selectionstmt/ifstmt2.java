// assignment stmt only in block because they are local variables if not in block they cannot be used anywhere. 
class Test
{
public static void main(String [] args)
{
if(true);
if(true)
{
int a=1;
System.out.println(a);
}
}

}