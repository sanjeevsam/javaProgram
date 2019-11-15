public class Swap1
{
    public static void Swap(int x,int y)
    {
        y=x+y;
        x=y-x;
        y=y-x;
        System.out.println("After swpping no. is :");
        System.out.println("x = "+x+ ","+"y = "+y);
    }
    public static void main(String args[])
    {
        int x=10;
        int y=20;
        System.out.println("Before swpping no. is :");
        System.out.println("x = "+x+ ","+"y = "+y);
        Swap(x,y);

    }
}