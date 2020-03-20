// both interfaces contains same method name , but different signature.
// if both interfaces contain methods with same name & signature but different return type we cannot implement 2 interfaces simultaneously by 1 class.
interface left
{
void m1();
}

interface right 
{
void m1(int i);
}

class Test implements left,right
{
public static void main(String [] args)
{
Test t = new Test();
t.m1();
t.m1(1);
}

public void m1()
{
System.out.println("no args passed for me!!");
}

public void m1(int i)
{
System.out.println("int  args passed for me!!");
}

}
