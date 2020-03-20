// final instance variable should be declared before constructor is initialised.

class Test
{
final int x;
final int y;
final int z=0;
{
x=1000;
}
Test()
{
y=1;
}

}