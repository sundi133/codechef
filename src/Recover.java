import java.util.Scanner;


public class Recover {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int tot= in.nextInt();
		int i=1;
		while(i<=tot){
			int m= in.nextInt();
			int msg_num= in.nextInt();
			String  msg= Integer.toString(msg_num);
			int res= calc(msg,msg,0,m);
			System.out.println("Case #" +i +": " + res);
			
			i++;
		}

	}
	private static int[] inttoarray(int msg_num) {
		// TODO Auto-generated method stub
		int [] arr = new int[1001];
		int i= msg_num;
		int k=1000;
		while(i>=0){
			int mod = i%10;
			arr[k]=mod;
			i=i/10;
		}
		return arr;
          
	}


	private static int calc(String amsg,String msg, int  index, int m) {

		if(msg.isEmpty())return 1;
		if(msg.length()==1 ){
			if(Integer.parseInt(msg) <= m)
				return 1;
			else
				return 0;
		}
		if(msg.charAt(0)==48){
			return 0;
		}
		int count=0;
		for(int  k=1;k<=msg.length();k++){
			
			String str1=msg.substring(0, k);
			String str2=msg.substring(k);
			String msg1= str1  + " " + str2;
			if(!str1.trim().isEmpty()){
				if(Integer.parseInt(str1.trim()) <= m)
					count+=calc(msg,str2,k+1,m);
			}
			//System.out.println( "msg "+ msg +" str2 " + str2+" str1 " + str1+ "k " + k + " index " + index + " count " + count);
		}
		return count;
	}

}
