package problems.programs;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]){
                System.out.println(i);
                System.exit(0);
            }
            leftsum += nums[i];
        }
        System.out.println("not present");
    }
}
