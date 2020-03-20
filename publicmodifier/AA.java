package pack2;
import pack1.A;
public class AA extends A
{
public static void main(String[] args)
{
AA a= new AA();
A    b= new A();
A  c= new AA();
a.pub();
a.pro();
c.pub();
		//c.pro();			//b.pro();  b can't be accessed from parent reference object.
b.pub();			//a.def(); doesn't work default method can be accessed from current package only.
}
}