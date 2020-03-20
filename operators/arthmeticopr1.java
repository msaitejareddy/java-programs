class Test
{
public static void main(String[] args)
{
int i1=10,i2=10;
int i=i1+i2;
System.out.println(i);

char c1='a',c2='b';
char c=(char)(c1+c2);		// 97+98
System.out.println(c);   	 //195

int l = i1+c1;		// 10+ 97
System.out.println(l);		//107

char z = (char)(i1+c1);		// 97+10=107  k
System.out.println(z);

double n='a'+10.5;		// 97+10.5 = 107.5 
System.out.println(n);

char y=(char)('a'+10.5);		// 97+10.5 = 107.5 
System.out.println(y);		// char(107.5)=k

byte b=10;
double d=b+1.0000;
System.out.println(d);       	//11.0000

byte s=(byte)(b+1234545);	// byte(11.0000)
System.out.println(s); 		//11
}

}