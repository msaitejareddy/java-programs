class Test
{
	public static void main(String args[])
	{
		byte a=1;
		System.out.println(a);

		// short s=1234567567;incompatible types: possible lossy conversion from int to short
                //short s=1234567567;
		
		short s=2344;
		System.out.println(s);

		// int b=12345678967685656;error integer number too large
		int b=1243;
		System.out.println(b);
		
		//long l='sa';   error: unclosed character literal    long l='sa';
		
		long distance=3675664;
		System.out.println(distance);
		
	}
}