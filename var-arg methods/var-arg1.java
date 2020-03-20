class test
{
public static void main(String[] args)
{
sum();
sum(10,20);
sum(100,200,300);
}
public static void sum()
{
System.out.println("sum is 0");
}

public static void sum(int i,int j)
{
int total=i+j;
System.out.println("sum is :" + total);
}

public static void sum(int a,int b,int c)
{
System.out.println("sum is : " + "  " + (a+b+c));
}
}
