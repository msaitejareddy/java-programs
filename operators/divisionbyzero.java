class Test
{
public static void main(String... args)
{
//System.out.println(10/0);	//arthemetic exception / by zero.
//System.out.println(10/0.0);	//Infinity type is max(int,float,int)=float
//System.out.println(-10/0.0);	//-Infinity type is max(int,float,int)=float
//System.out.println(0/0);	// arthemetic exception / by zero.
//System.out.println(0.0/0);	//NaN not anumber  as type is max(int,float,int)=float
//System.out.println('a'/0);	//arthemetic exception / by zero.
System.out.println(-'a'/0.0);	//-Infinity type is max(int,float,int)=float
}
}