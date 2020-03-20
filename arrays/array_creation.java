class Test
{
public static void main(String[] args)
{
int[] x=new int[3];
x[0]=10;
x[1]=20;
x[2]=30;
System.out.println(x);  // when we print reference variable output is class name@ hash code.
System.out.println(x[0]);

     	//x[3]=40; error array index out of bound exception 
	// x[2.5]=100; incompatible type:possibly loss of conversion
}
}