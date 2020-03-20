class Test
{
static String Country="USA";
int x=100100;

public static void main(String[] mstr)
{
Test t=new Test();
t.x=0;
t.Country="INDIA";
System.out.println(t.Country+"  "+t.x);   //INDIA 0


Test t1=new Test();
System.out.println(t1.Country+"  "+t1.x);   // INDIA 100100
}
}
