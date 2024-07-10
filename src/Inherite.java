
// This code is written for the purpose of understanding structure of multilevel inheritance concept in java
public class Inherite
{
    void funcInherite()
    {
        System.out.println("Prepare to call ");
    }

    public void funcElva() {
    }

    public void funcGroup() {
    }
}
class Group extends Inherite
{
    {
        System.out.println("call is ready to Connect");
    }
}
class Early extends Inherite {
    void funcEarly() {
        System.out.println("Call is connected");
    }
}
class Elva extends Inherite
{
    {
        System.out.println("Call is connected");
    }
}

class Darik
{
    public static void main(String[] args)
    {
     Early E= new Early();
        E.funcInherite();
        E.funcEarly();
        E.funcGroup();
        E.funcElva();
    }
}