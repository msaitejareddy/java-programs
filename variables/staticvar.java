class Test
{
static String college="MVSREC";

public static void main(String[] args)
{
System.out.println(college);

Test t=new Test();
		//System.out.println(t.college);
		//System.out.println(college);
System.out.println(Test.college);   //recommended 
t.fun1();
}
public void fun1()
{
System.out.println(Test.college);
}
}
