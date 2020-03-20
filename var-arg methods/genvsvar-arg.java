// general method as more priority when compared to variable number of args method(1.5V)
// if the method signature is same
class Test
{
public static void main(String... args)
{
f1(10);
f1(10,-10);
}
public static void f1(int i)
{System.out.println(i + " printing in general method");}

public static void f1(int... j)
{System.out.println(j[0]+","+ j[1] + " printing in VAR_ARG method");}
}