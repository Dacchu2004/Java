package placeJ;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isArmstrong(n));

//printing 3 digit armstrong numbers
        System.out.println();
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i+"  ");
        }
    }
}

//checking whether the given number is armstrong or not
    static boolean isArmstrong(int n){
        int org = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        return sum == org;
    }
}
