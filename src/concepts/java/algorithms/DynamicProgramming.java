package concepts.java.algorithms;

import java.util.*;

public class DynamicProgramming {
    // Climbing stairs: #ways to reach n with 1 or 2 steps
    public static int climbStairs(int n){
        if(n<=2) return n;
        int a=1,b=2;
        for(int i=3;i<=n;i++){ int c=a+b; a=b; b=c; }
        return b;
    }

    // Coin change: min coins to make amount (bottom-up)
    public static int coinChangeMin(int[] coins, int amount){
        int INF = 1_000_000, n = amount+1;
        int[] dp = new int[n];
        Arrays.fill(dp, INF);
        dp[0]=0;
        for(int c: coins){
            for(int i=c;i<=amount;i++){
                dp[i] = Math.min(dp[i], dp[i-c]+1);
            }
        }
        return dp[amount]==INF ? -1 : dp[amount];
    }

    public static void main(String[] args){
        System.out.println("climbStairs(5) = " + climbStairs(5));
        System.out.println("coinChangeMin([1,2,5],11) = " + coinChangeMin(new int[]{1,2,5},11));
    }
}
