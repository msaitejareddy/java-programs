// instanceof is used to check the type of object by reference variable.   r(reference variable) 
// r instanceof X(any class or interface)   r ,x should be child X parent or of same type.

class Test
{
public static void main(String[] args)
{
Test a = new Test();
System.out.println(a instanceof Object);

Thread t = new Thread();
System.out.println(t instanceof Thread);
System.out.println(t instanceof Object);
System.out.println(t instanceof  Runnable);

}


}
