// if instance var are not initialised
//jvm sets instance var to their default values.

class Test
{
int z;
String name;
float f;
char ch;
boolean b;

public static void main(String[] sai)
{
Test t1=new Test();
System.out.println(t1.z);	//0
System.out.println(t1.name);	//null
System.out.println(t1.f);	//0.0
System.out.println(t1.ch);      //default is blank 
System.out.println(t1.b);	// default is false.
}
}

