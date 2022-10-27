package problems.programs;

public class SingleElementInSortedArray
{
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    private static int singleNonDuplicate(int[] nums) {

        //Checking for the boundary cases
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        //binary search
        int left=0;
        int right = nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            {
                return nums[mid];
            }
            if((mid%2!=0 && nums[mid-1]==nums[mid])||
                    (mid%2==0 && nums[mid+1]==nums[mid]))
            {
                left=mid+1;
            }
            else{
                right= mid - 1;
            }
        }
        return -1;
    }
}
