//check the sum of elements in an array is equal to target and print them
//[2,7,1,3] and target = 9


public class q1pla {
    public static void main(String[] args) throws Exception {
        int[] numbers = {2,7,1,3};
        int targNum = 9;

        twoSum(numbers, targNum);
    }

    public static void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    System.out.printf("pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
            
        }
                 
    }
}
        

