// static variable can be accessed from both static & instance methods.
// instance var must be accessed from instance method only.

class Test
{
int x=100;
static int y=0;
public static void main(String[] args)
{
			// non static var x can't be referenced from static context System.out.println(x);
Test t = new Test();
t.m1();
}
public void m1()  	// instance method
{
System.out.println(x);
System.out.println(y);
}}