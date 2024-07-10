public class A
{

    public static void callmetoo() {
    }

    void A()
    {

        System.out.println("This is a class");
    }
}
class B extends A
{
    public static void callme() {

    }

    void B()
    {

        System.out.println("This is method ");
    }
}
class Car {
    public static void main(String[] args) {
        B b =new B();
        b.callme();
        b.callmetoo();

    }
}