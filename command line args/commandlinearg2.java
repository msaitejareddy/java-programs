// program to find square of number input given from command line.
class Test
{
public static void main(String[] args)
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);

System.out.println("The square of  " +  n1 + "," + n2 +  " :  " + (n1*n1)  + "," + (n2*n2));  
}
}