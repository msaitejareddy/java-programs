// private method can be accesed within same class only.
// class level modifiers are public,<default>,final ,strictfp,abstract.

package pack1;
class A
{
private void m1()
{
System.out.println("welcome");
}

}

class B extends A
{
public static void main(String[] args)
{
A a= new A();
a.m1();
}
}

