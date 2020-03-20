// both interfaces contains same method name and signature.
interface left
{
void m1();
}

interface right 
{
void m1();
}

class Test implements left,right
{
public static void main(String [] args)
{
Test t = new Test();
t.m1();
}

public void m1()
{
System.out.println("just implemented one service for both interfaces");
}

}
