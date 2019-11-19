public class TheHulk {
    public static void main(String[] args) {
    int n = 63; //Integer.parseInt(args[0]);
    smash(2, n);
    System.out.println();
    }
    public static void smash(int a, int b) {
    if(a <= b) {
        if(b%a == 0) {
            System.out.print(" " + a);
            smash(a, b/a);
    } else {
            a = a+1;
            smash(a, b);
           }
       }
    }
}