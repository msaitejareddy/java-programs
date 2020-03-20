// public ,static are modifiers
// case:1 order of modifiers is not important.
// case2: we can use other modifiers final,synchronized,strictfp along with public static
// case 3: name of identifiers can be changed "args"
//case 4: replace 1 dimensional array with var-arg method.

class Test
{
 static public final strictfp synchronized void main(String... saiteja)
{
System.out.println("case1:static public void main() is working!");
System.out.println("static public final strictfp synchronized void main(String[] saiteja) @ amazing!!");
System.out.println("String[] == String... (var - arg method)");
}
}