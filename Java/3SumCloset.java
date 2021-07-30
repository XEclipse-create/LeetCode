class Solution{
    public int threeSumClosest(int[] nums, int target) {
        int x = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
            
        {
            int start= i+1, end = nums.length-1;
            while(start<end)
            {
                int sum = nums[start]+ nums[end]+ nums[i];
                if(Math.abs(target-sum)<Math.abs(x))
                    x= target - sum;
                if(sum<target)
                    start++;
                else
                    end--;
                    
            }
        }
        return target-x;
    }
}
