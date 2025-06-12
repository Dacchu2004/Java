package placeJ;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is in Lower Case");
        }else{
            System.out.println("It is in Upper Case");
        }
    }
}
