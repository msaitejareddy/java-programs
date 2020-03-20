class Test
{
public static void main(String[] args)
{
String s1=new String("India");
String s2=new String("india");
String s3=new String("pakistan");
String s4 =new String("Iran");
String s5=new String("iran");

System.out.println(s1.equals(s2)	);
System.out.println(s4.equals(s5) );
System.out.println(s3.equals(s4));

s4=s5;
System.out.println(s4 + " "+  s5);    
System.out.println(s4==s5);
System.out.println(s4.equals(s5));
}


}