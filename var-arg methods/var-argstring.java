class test
{
public static void main(String[] args)
{
display();
display("sai","teja");
display("i am java developer");
display("a","aa","aaa","aaaa");
}
public static void display(String... x)
{
for(String  x1:x)
{
System.out.println(x1);
}}
}