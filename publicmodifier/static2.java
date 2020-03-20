// if there is atleast 1 instance var in a method it should be declared as instance.
// if there are no instance var we can declare as static method.

class Test
{
int num=100;		// instance
static String clg="UNT";	//static
String name="sai";		// instance

public void getStudentDetails()		// instance method
{
System.out.println(num + " ......"+ name);
}

public static void getCollegeDetails()	//static method
{
System.out.println("college name is " + clg);
}

public  static void getStudentGrades()	// static method
{
System.out.println("your gpa s 3.0 ");
}

public void getAllInfo()
{
System.out.println(num + " ......"+ name +  "...." + clg);
}

public static void main(String[] args)
{
getCollegeDetails();
getStudentGrades();
Test t = new Test();
t.getStudentDetails();
t.getAllInfo();
}
}
