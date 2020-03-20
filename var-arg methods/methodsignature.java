class Test
{
public static void f1(int f)
{
System.out.println(f);				
}
public static void f1(int[] j)
{
for(int x1:j)
{
System.out.println(x1);
}
}
public static void main(String[] args)
{
f1(10);
f1(new int[]{100,200,300,400});
}
}
