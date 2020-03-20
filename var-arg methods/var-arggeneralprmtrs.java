// we can pass only many general parametres and 
//1 var-arg parametre should be declared last after general parametres  
class Test
{
public static void main(String... args)
{
display("infinite power","infinite energy","infinite intelligence");
}
public static void display(String x,String... y)
{
System.out.println(x);
for(String x1:y)
{
System.out.println(x1 + ": length of string is " +x1.length());
}
}}
