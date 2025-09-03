package Dynamic_Programming;

import java.util.Arrays;

public class House_robber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, 9 ,3, 1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.print(robber(arr, 0, dp));
	}
	public static int robber(int[] arr, int idx, int[] dp) {
		if(idx >= arr.length) {
			return 0;
		}
		if(dp[idx] != -1) {
			return dp[idx];
		}
		int take = arr[idx] + robber(arr, idx+2, dp);
		int notTake =robber(arr, idx+1, dp);
		dp[idx] = Math.max(take, notTake);
		return Math.max(take, notTake);
	}
}
