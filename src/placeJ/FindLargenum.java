package placeJ;

public class FindLargenum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//  Largest number
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = 0;
//        if (b > a) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

//using math class
//        int max = Math.max(c,(Math.max(a,b)));
//        System.out.println(max);

// Largest number using for loop
        int[] num={2355,28648,46,82748,46758};
        int max=num[0];
        for (int i=0; i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}