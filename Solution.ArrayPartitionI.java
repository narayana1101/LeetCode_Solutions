class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort( nums );
        int count = 0;
        for( int i = 0; i < nums.length; i += 2 )
            count += Math.min( nums[i], nums[i+1] );
        return count;
    }
}