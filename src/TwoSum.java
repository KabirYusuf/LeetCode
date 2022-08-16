import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] num = {2 , 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num, target)));

    }

    public static int[] twoSum(int [] nums, int target){
        int [] output = new int[2];
        for(int i = 0; i <= nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if(result == target){
                    output[0] = i;
                    output[1] = j;
                    break;
                }

            }
        }
        return output;

    }
}
