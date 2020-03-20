class test
{
public static void main(String [] args)
{
display(new int[]{0,-1,-2,-3},new int[]{100,220});
}
public static void display(int[]... x)
{
for(int[] x1:x)
{
System.out.println(x1[0]);
}
}}
