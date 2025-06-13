package placeJ;

public class CountOccurs {
    public static void main(String[] args){
//counting the repetation/occurance if a particular num in a digit
        int n=14446748;
        int count =0;

        while(n>0){
            int rem=n%10;
            if(rem==4){
                count++;
            }
            n=n/10; // n/=10;
        }
        System.out.println(count);
    }
}
