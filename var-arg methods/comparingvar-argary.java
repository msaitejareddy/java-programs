class test
{
public static void main(String... args)
{m1();
}
public static void m1(int[] x)
{
   // error: cannot declare both m1(int...) and m1(int[]) in test
}
public static void m1(int... x)
{
} 
}