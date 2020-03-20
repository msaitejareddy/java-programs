class Test
{
int ins=100;
static int stat=200;
public static void main(String [] args)
{
int loc=300;

Test t1=new Test();
t1.ins=0;
t1.stat=0;

Test t=new Test();
int sum=(loc+Test.stat+t.ins);
System.out.println(sum);
}
}