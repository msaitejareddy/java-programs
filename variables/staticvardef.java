// if static var are not initialised
//jvm sets static var to their default values.

class Test
{
static int z;
static String name;
static float f;
static char ch;
static boolean b;

public static void main(String[] sai)
{

System.out.println(Test.z);	//0
System.out.println(Test.name);	//null
System.out.println(Test.f);	//0.0
System.out.println(Test.ch);      //default is blank 
System.out.println(Test.b);	// default is false.
}
}

