package placeJ;



public class findfibo {
    public static void main(String[] args) {
////find the fibonacci of n using temp
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a=0;
//        int b=1;
//        int count = 2;
//
//        while (count<=n){
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);


//// Find the nth Fibonacci number without using temp
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while (count <= n) {
//            b = a + b; // b becomes next fib number
//            a = b - a; // a is updated to old b (b - a gives old a)
//            count++;
//        }
//
//        System.out.println(b);

//10 fibonacci numbers without temp
        int n = 10; // Number of Fibonacci numbers to print
        int a = 0;
        int b = 1;

        System.out.print(a + " "); // First number
        if (n >=1) {
            System.out.print(b + " "); // Second number
        }

        int count = 2;
        while (count < n) {
            b = a + b;     // b becomes next Fibonacci number
            a = b - a;     // a becomes previous b
            System.out.print(b + " ");
            count++;
        }
    }
}
