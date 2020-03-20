abstract class parent
{
 abstract public void property();

final public void marry()
{
System.out.println("marry subbalaxmi");
}
}

class child extends parent
{
 
public static void main(String[] args)
{
child cobj= new child();
cobj.marry();
cobj.property();
}

public void property()
{
System.out.println("gold cash silver platinum");
}

}