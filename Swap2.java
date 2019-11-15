public class Swap2
{
    public static void Swap(int x,int y)
    {
        int temp;  //using third variable
        temp=x;
        x=y;
        y=temp;
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