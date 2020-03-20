class Test
{
public static void main(String[] args)
{
System.out.println(10==10.00000);	// true internally int is promoted to double. 
System.out.println('a'==97.00000);	// true internally 'a'=97 ,97 is promoted to double 97.00000. 
System.out.println('a'=='A');		// false 97!=65 
int i='A';			// 
System.out.println(i);		// '65' should return ASCII value of A char is promoted to int.(default type for integral types)

System.out.println('a' > 'A');
System.out.println('a' > 97.5);
System.out.println(10 < 20); 	//true
	//System.out.println(10 < 20 < 30);	// compile error : 10<20 is true , true<30 gives error  we can't use < for boolean type.
			// hence nesting of operators cannot be done .
	//System.out.println(true<false);

	// bad operand type  < for String and String .System.out.println("sai"< "teja");


}


}