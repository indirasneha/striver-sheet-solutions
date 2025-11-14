public class Functions{

    // Function to return maximum of four numbers
    public static int max_of_four(int a, int b, int c, int d) {
        int max = a;          // assume a is max

        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(max_of_four(a, b, c, d));
    }
}
