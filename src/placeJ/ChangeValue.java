package placeJ;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,8,5,7,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=2;
    }
}
