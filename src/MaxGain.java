
public class MaxGain {

	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,6,2,5,4,9,3,10};
		
		int[][] dp = new int[arr.length+1][arr.length+1];
		int tog=0;
		for(int k=0;k<arr.length;k++){
			dp[k][k]=arr[k];
		}
		for(int i=1;i<=arr.length;i++){
			for(int j=arr.length;j>0;j--){
				if(i<j){
					System.out.println(i + " " + j);
				if(tog==0){
					
					dp[i][j]+= max(dp[i][j-1]+arr[j-1],dp[i+1][j]+arr[i-1]);
					tog=1;
				}else{
					dp[i][j]+= min(dp[i][j-1]+arr[j-1],dp[i+1][j]+arr[i-1]);
					tog=0;
				}
				}
			}
		}

		System.out.println(dp[1][arr.length]);
	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?j:i;
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?i:j;
	}

}
