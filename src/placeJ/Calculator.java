package placeJ;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int res =0;

        while (true) {

            System.out.println("Do you want to Calculate?(Y/N)");
            char start =in.next().trim().charAt(0);
            if(start == 'Y' || start=='y'){

                System.out.println("Enter the 2 numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                System.out.println("Enter the operator:");
                char op=in.next().trim().charAt(0);

                if(op=='+'){
                    res=num1+num2;
                }
                if(op=='-'){
                    res=num1-num2;
                }
                if(op=='*'){
                    res=num1*num2;
                }
                if(op=='/'){
                    if(num2==0){
                        System.out.println("Infinity");
                    }else{
                        res=num1/num2;
                    }
                }
                if(op=='%'){
                    res=num1%num2;
                }
                if (!(op== '+' || op== '-' || op== '*' || op== '/' || op== '%')){
                    System.out.println("Inavlid Operator");
                }

            }else if(start == 'N'|| start=='n'){
                break;
            }
            System.out.println("Result:"+ res);
            System.out.println(" ");
            System.out.println(" ");
        }
    }
}
