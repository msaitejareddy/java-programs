//interface methods are always public and abstract

interface motel
{
 void takeid(); 	// final cannot be used because this is implemented by other classes also. 
void takepayment();
void giveroomkey();
void answercalls();
}

class sai implements motel
{
public void takeid()
{}
public void takepayment()
{}
public void giveroomkey()
{}
public void answercalls()
{}
}


class bharath implements motel
{
public void takeid()
{}
public void takepayment()
{}
public void giveroomkey()
{}
public void answercalls()
{}
}

class yashwanth implements motel
{
public void takeid()
{}
public void takepayment()
{}
public void giveroomkey()
{}
public void answercalls()
{}
}
