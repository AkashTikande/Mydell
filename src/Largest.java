public class Largest {
    public static void main(String[] args) {
        int no1,no2,no3,large;
        no1=Integer.parseInt(args[0]);
        no2=Integer.parseInt(args[1]);
        no3=Integer.parseInt(args[2]);
        large=(no1>no2)?no1:no2;
        large=(large>no3)?large:no3;
        System.out.println("Largest no:"+large);
    }
}
