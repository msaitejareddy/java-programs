class Test
{
String name="saiteja";  // instance variable
public static void main(String[] args)
{
				// System.out.println(i); error cannot be accesed from static area.
Test t1=new Test();
System.out.println(t1.name);    //saiteja
t1.name="reddy";              
System.out.println(t1.name);     //reddy

}

}