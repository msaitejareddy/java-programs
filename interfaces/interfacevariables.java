// interface variables are public ,static , final they can't be changed .

interface motel
{
String phno="9401234567";
String password="********";
String bocpassword="**********";
String exppword="*********";
String wifi="welcomeguest";
void shiftnum();
}

class sai implements motel
{
public static void main(String[] args)
{
	// we can't assign value to final variable	phno="1234567";
System.out.println(phno);
System.out.println(wifi);
}
public void shiftnum()
{
System.out.println("my shift number is 2");
}
}


class yash extends sai
{

}

class bharath extends yash implements motel
{

public static void main(String [] args)
{
bharath b = new bharath();
b.shiftnum();
}

public void shiftnum()
{
System.out.println("my shift number is 3");
}

}


class akhil extends bharath
{}