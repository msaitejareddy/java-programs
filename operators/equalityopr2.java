class Test
{
public static void main(String[] args)
{
String s1 = new String();
System.out.println(s1);
s1="saiteja";
System.out.println(s1);

Thread t1=new Thread();
Thread t2 = new Thread();
System.out.println(t1==t2);    // false  t1 and t2 pointing to different objects.
System.out.println(t1.equals(t2));	// false

Object o1 = new Object();
System.out.println(o1==t1);	// false
System.out.println(o1==s1);	// false
System.out.println(t1==s1);	// ce: ==(Incomparable types Thread and String) cannot be used for objects not related to each other.

}


}