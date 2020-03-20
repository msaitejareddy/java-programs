// adapter class we implement all methods in interface and by extending that we implement required methods only.
interface cities
{
void dallas();
void huoston();
void austin();
void newyork();
void nashville();
void atlanta();
}

class adapterx implements cities
{
public void dallas()
{}
public void newyork()
{}
public void nashville()
{}
public void atlanta()
{}
public void huoston()
{}
public void austin()
{}
}

class Test1 extends adapterx
{
public void nashville()
{
System.out.println("i been to nashville downtown and visited state capitol");
}
public static void main(String[] sai)
{
Test1 t1 = new Test1();
t1.nashville();
}
}

class Test2 extends adapterx
{
public void atlanta()
{
System.out.println("i ate lunch by sitting on 72 nd floor in sundial restaruant");
}
public static void main(String[] teja)
{
Test2 t2 = new Test2();
t2.atlanta();
}
}