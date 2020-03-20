class Test
{
public static void main(String [] args)
{
int a=10;
int b,c,d,e,f;
b=c=d=e=f=100;
System.out.println(b + " " + c + " " +d + " " + e );     //100  100  100 100  

b +=1000;		// b=b+1000=b=100+1000=1100    a +=101   a=a+101   b-=100  b=b-100  c*=100      c=c*100
c -=500;		//c=c-500=100-500=-400
d *=10;		// d=d*10=100*10=1000
e /=5;		//e=e/5 =100/5=20
f  %= 100;		// f=f%100=100%100 =0


System.out.println(b + " " + c + " " +d + " " + e + " " + f);

}

}