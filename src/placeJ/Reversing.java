package placeJ;

public class Reversing {
    public static void main(String[] args) {
//Reversing the number
        int n = 231487;
        int res=0;

        while(n>0){
            int rem = n % 10;
            res = res*10 + rem;
            n = n/10;
        }
        System.out.println(res);
    }
}
