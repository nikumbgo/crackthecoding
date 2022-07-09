package toptalquestions;

/**
 * Contiguous max sum in an array
 */
public class ContiguousMaxSumInArray {

    public static void main(String args[])
    {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int tempMax =nums[0];
        int finalMax = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=0 && tempMax<0)
            tempMax = nums[i];
            else
                tempMax+=nums[i];

            if(tempMax > finalMax)
                finalMax = tempMax;
            if(nums[i] > finalMax)
                finalMax= nums[i];
        }
        return finalMax;
    }
}
