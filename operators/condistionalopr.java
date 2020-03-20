// ternary operator     (a condition b)?  true  :  false

class Test
{
public static void main(String [] args)
{
int a=((10>20)?100:1000);
System.out.println(a);		// 1000

String x=((100<110)?((10<15) ? "kaboom":"kingfisher") : "bira");
System.out.println(x);


}
}