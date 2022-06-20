import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int [] nums) {
        int  [] dp =new  int [nums.length];
        Arrays.fill(dp, 1);

        for(int i =1; i<nums.length; i++){
            for(int j = 0; j < i ;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
            }
        }

        int longest = 0;
        for(int c :dp){
            longest = Math.max(longest, c);
        }
        return longest;
    }
    
}

public class LongestIncreasingSubsequence {
   public static void main(String[] args) {
      int [] nums = {10,9,2,5,3,7,101,18};
      Solution s1 = new Solution();

      int result = s1.lengthOfLIS(nums);
      System.out.println(result);
      
   }
}

