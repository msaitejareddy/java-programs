// default value for static and instance variable is done by JVM.
// final is the only modifier allowed for local variable.

class A
{
public final static int x=100;
private final static String name="george Reddy";
protected int z=0;

public static void main(String[] args)
{
A a= new A();
final int i=123;
System.out.println(x + "   " + name + "   " + a.z  + "   " + i);

}
}