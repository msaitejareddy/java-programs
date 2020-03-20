class master_123
{
public static void main(String [] args)
{
Object[] x=new Object[6];
Number[] y=new Number[0];
int[][] z= new int[10][15];
x[0]=100;
x[1]='s';
x[2]="falaknama das";
x[3]=123.987654;
System.out.println(z.getClass().getName());
System.out.println(x.getClass().getName());
System.out.println(y.getClass().getName());
System.out.println(x[0] + "\n" +x[1]+ "\n" +x[2]+ "\n" +x[3]+ "\n" + x[4]+"\n"+x[5]);
}
}