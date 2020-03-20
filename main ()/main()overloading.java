// public static void main(int[] args) is a normal function it should be called.
class A
{
public static void main(String[] args)
{
System.out.println("printing String[] args method");
main(new int[]{10});
}
public static void main(int[] args)             // this acts like a normal function call only
{
System.out.println("printing int[] args method");
}}