class Test
{
int[] a;   // instance variable
static int[] s;
public static void main(String [] args)
{
Test t =new Test();
System.out.println(t.a);
System.out.println(t.a[0]);

System.out.println(t.s);
System.out.println(t.s[0]);

}
}
