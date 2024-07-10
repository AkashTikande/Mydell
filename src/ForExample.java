//ths programme is based upon use of for loop for multiple looping at aa single place.magical math's
public class ForExample {
    public static void main(String args[])
    {
        int i;
        for(i=1;i<=3;i++)
        {
            System.out.println("The count is:\n"+i);
           // System.out.println(i);
            for(int j=1;j<=3;j++)
            {
               // System.out.println(j);
                //System.out.println("This is count:- \n"+j);
              System.out.println(i+""+j);
            }
        }
    }
}
