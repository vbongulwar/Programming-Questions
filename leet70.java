
//70
//You are climbing a stair case. It takes n steps to reach to the top.

//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        return climbStairsRev(dp,n);
        
    }
public int climbStairsRev(int[] dp, int n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(dp[n]==0)
        {
        int take1 = climbStairsRev(dp,n-1);
        int take2 = climbStairsRev(dp,n-2);
        dp[n] = take1+take2;
        }
        return dp[n];
    }
}

//time complexity will be O(N). The space complexity will also be O(n) [ this space will be used to store the recursion-stack]

