
public class allparent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		String str="";
			for(int i=0;i<n;i++){
				str+="(";
			}
		for(int i=0;i<n;i++){
			str+=")";
		}
		//System.out.println(str);
		//printall(str,"");
		printPar(n);
	}

	public static void printPar(int count) {
		 char[] str = new char[count*2];
		 printPar(count, count, str, 0);
	}
	
	public static void printPar(int l, int r, char[] str, int count) {
		 if (l < 0 || r < l) return; // invalid state
		 if (l == 0 && r == 0) {
		 System.out.println(str); // found one, so print it
		 } else {
		 if (l > 0) { // try a left paren, if there are some available
		 str[count] = '(';
		 printPar(l - 1, r, str, count + 1);
		 }
		 if (r > l) { // try a right paren, if there’s a matching left
		 str[count] = ')';
		 printPar(l, r - 1, str, count + 1);
		 }
		 }
		 }

	private static void printall(String str,String sofar) {
		
		int len=str.length();
		System.out.println(str + "" + sofar);
		if(len==0){
			System.out.println(str + "" + sofar);
			return;
		}
		for(int k=1;k<str.length()/2;k++){
			String sofar1 = str.substring(0,k);
			for(int x=0;x<k;x++){
				sofar1+=")";
			}
		
			printall(str.substring(k,len-k),sofar+sofar1);
			printall(str.substring(k,len-k),sofar+sofar1);
		}
		
	}

}
