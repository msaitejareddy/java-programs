class Test
{
public static strictfp void main(String [] sai)
{
System.out.println(10 > Float.NaN);      	//false
System.out.println(10 >= Float.NaN);
System.out.println(10 < Float.NaN);
System.out.println(10 <= Float.NaN);
System.out.println(10 == Float.NaN);	
System.out.println(Float.NaN == Float.NaN);	//false

System.out.println(10 != Float.NaN);		//true
System.out.println(Float.NaN != Float.NaN);		//true



}
}