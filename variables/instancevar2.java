class Test
{
String msg="knowledge is wisdom!!";  // instance variable

public static void main(String[] args)
{
Test t1=new Test();
System.out.println(t1.msg+"\n printed from main method"); 
}

public void m1()
{
System.out.println(msg);
 }

}