// program for int data type we can assign byte,short,char,int data types as array elements.
//for double type array -->byte,short,char,int,;ong,float and double.

class Test
{
public static void main(String args[])
{
double[] a=new double[10];
a[0]=619;
a[1]='a';
short s=6;
a[2]=s;
byte b=127;
a[3]=b;
a[4]=100l;
a[5]=123.4566;
a[6]=123.655454556456456456;
 
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

}
}
