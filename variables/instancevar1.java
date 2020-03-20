class Test
{
String wish="good morning to all!!";  // instance variable
public static void main(String[] args)
{
Test t1=new Test();
t1.wish=t1.wish+" "+"have a wonderful day";              
System.out.println(t1.wish); 

Test t2=new Test();
System.out.println(t2.wish+" now in t2 object");
   

}

}