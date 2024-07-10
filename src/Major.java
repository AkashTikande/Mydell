
// This code is written for the purpose of understanding structure of multilevel inheritance concept in java
public class Major {
    void funcMajor()
    {
        System.out.println("Prepare to call ");
    }
}
class Exited extends Major
{
    void funcExited()
    {
        System.out.println("call is ready to Connect");
    }
}
class Preserve extends Exited
{
    void funcPreserve()
    {
        System.out.println("Call is connected");
    }
}
class Demo
{
    public static void main(String[] args)
    {
    Preserve P = new Preserve();
    P.funcMajor();
    P.funcExited();
    P.funcPreserve();

    }
}