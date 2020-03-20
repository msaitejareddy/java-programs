class Test
{
public static void main(String [] args)
{
Test t = new Test();
String j = new String();
System.out.println(j);

Student i= new Student();
if(t instanceof Object)
{
System.out.println("just t object created without Test() constructor");
}
else
{
System.out.println(" object cannot created without Test() constructor");
}
}

}