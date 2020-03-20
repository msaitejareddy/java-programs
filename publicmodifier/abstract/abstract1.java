abstract class vehcile
{
public abstract void getwheels();
public  abstract void yearmaking();
public void disp()
{
System.out.println("sai is a great java developer");
}
}

class bandi extends vehcile
{

public void getwheels()
{
System.out.println("4 wheeler");
}

public void yearmaking()
{
System.out.println("Hyundai sonata --- 2017");
System.out.println("Benz 4matic  --- 2019");
}

public static void main(String [] args)
{
bandi bobj = new bandi();
bobj.yearmaking();
bobj.getwheels();
bobj.disp();
}

}