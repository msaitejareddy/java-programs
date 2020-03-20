interface shell
{
void freegas();
}

interface motel
{
void freetime();
}

abstract class sai implements shell, motel   	// class is abstract because all methods are not implemented in this class. 
{
public void freegas()
{
System.out.println("I fill gas every 3 weeks and love to work here");
}


}

class puli extends sai
{
public void freetime()
{
System.out.println("I have dhuniya time to study here");
}

public static void main(String [] args)
{
puli p = new puli();
p.freegas();
p.freetime();
}
}
