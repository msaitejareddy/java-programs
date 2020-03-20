// interface var are final,public ,static    if var names are same call them by interfacename.var_name.
interface left
{
int centre =1234;
}

interface right
{
int centre=6789;
}

class Test implements left,right
{
public static void main(String [] args)
{
System.out.println(left.centre + right.centre );
System.out.println(right.centre);
}
}