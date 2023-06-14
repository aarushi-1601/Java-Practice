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
            int sum = 0;

            if (nums[i] <= target) {
                int[] sumNums = {target - nums[i]};

                for (int j = 0; j < sumNums.length; j++) {
                    sum += sumNums[j];
                    System.out.println(sum);
                }
            }
        }
    }
}
