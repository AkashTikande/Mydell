public interface Drawable {
    void draw();
}     // Interface is blueprint of class , it is mechanism to archive abstraction
     //Java Interface is also represents IS-A relationship.

 class Triangle implements Drawable  //interface is a blueprint of class,
{          //it is used to archive overloading
          //it can be used to archive loose coupling
         // by using interfacing we can support functionality of multiple inheritance
    public void draw()
    {
        System.out.println("Drawing rectangle:");
    }
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("Draw circle:");
    }

}
class Interface
        {
            public static void main (String args[])
        {
            Drawable d = new Circle();
            d.draw();
        }
        }

        /*Interface Example:
        * -
        * public Interface Drawable
        * void draw();
        *class rectngle implement Drawable;
        * Public static void main(String args[])
        * }
        * class circle implements Drawable;
        * public void draw()
        * {
        * System.out.println("Drawing rectangle")
        * }
        * class circle implement Drawable
        * {
        * public void Draw()
        * {
        * System.out.println("Draw Circle's);
        * class Interface
        * {
        * public static void main(String args[])
        * drawable d =new Circle()
        * d.draw();
        * }
        * }
        *
        * */