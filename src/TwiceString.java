import java.util.Scanner;


public class TwiceString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String str= in.next();
		int len =str.length();
		int i = len-1;
		while(i>0 && !(str.substring(0,i).equalsIgnoreCase(str.substring(len-i)))){
			i--;
		}
		String res=str + str.substring(i);
		System.out.println(res);
	}

}
