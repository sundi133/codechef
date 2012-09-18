
public class countas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" A quick brown fox jumped over a bridge on a box.";
		char[] res = resplaceAll(str.toLowerCase());
		for(int k=0;k<res.length;k++){
			System.out.print(res[k]);
		}

	}

	private static char[] resplaceAll(String str) {
		// TODO Auto-generated method stub
		 
		int counta=countas(str);
		System.out.print(counta);
		int size=str.length() + 2*counta+1;
		char[] res = new char[size];
		res[size-1]=' ';
		int pnt=size-2;
		for(int k=str.length()-1;k>=0;){
			if(str.charAt(k)=='a'){
				
				res[pnt--]='e';
				res[pnt--]='h';
				res[pnt--]='t';
				res[pnt--]=' ';
				k=k-2;
				
			}else{
				res[pnt--]=str.charAt(k);
				k--;
			}
			
		}
		return res;
	}

	private static int countas(String str) {
		// TODO Auto-generated method stub
		int k=0;
		int cntA=0;
		while(k<str.length()){
		if(str.charAt(k)=='a'){
		cntA++;
		}
		k++;

		}
		
		return cntA;
	}

}
