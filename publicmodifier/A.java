package pack1;
public class A
{

private void pvt()
{
System.out.println("i am private within this class only");
}


protected void pro()
{
System.out.println("within this package pack1 and from my child class in different package ");
}

public void pub()
{
System.out.println("i can be accessed from anywhere within package or from outside package too ");
}

void def()
{
System.out.println("can be acesed from anywhere within current package");
}

public static void main(String[] args)
{
A a =new A();
a.pvt();

}

}

class B extends A
{
public static void main(String[] args)
{
A a =new A();
B b =new B();
a.pub();
b.def();
		// this cannot accesed from child class b.pvt();
b.pro();
}
}

