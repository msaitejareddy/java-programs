interface guest
{
void BreakFast();
void CleanRooms();
void FreeWifi();
}

interface property extends guest
{
void choicesupport();
}

class RodewayInn implements guest
{
public void BreakFast()
{
System.out.println("Free continental break fast served here!");
}

public void CleanRooms()
{}

public void FreeWifi()
{}

}

class Frontdesk extends RodewayInn
{
public static void main(String[] args)
{
Frontdesk f= new Frontdesk();
f.BreakFast();
}
}