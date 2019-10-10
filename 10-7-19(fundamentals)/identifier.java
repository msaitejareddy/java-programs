class identifier{

public static void main(String args[])
{
//int 123=10; error
//int @x=100; error
// int import/if/else/while/public=100;   gives error because reserved words cannot be used as variables

double f=2.345;
int sai=123;char _$='s';
int imports=10;
char string='a';   // we can use predefined class or interface as variable.

System.out.println(sai);
System.out.println(_$);
System.out.println(f);
System.out.println(imports);
System.out.println(string);
}
}