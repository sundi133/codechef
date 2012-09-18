
public class cntAnagrams {

	/**
	 * @param args
	 */
	public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AAbaz";
		int i=0;
		countAnagrams(str, "", i);
		System.out.println(count);

	}

	public static int countAnagrams(String str, String sofar, int i){

		if(str.length()==0){
		count++;
		System.out.println(sofar);
		}
		else{
		for(int k=0;k<str.length();k++){
			
		    String rem = str.substring(0,k) + str.substring(k+1);
		    String tobe="";
		    int len=k;
		    if(k>0 && (k+1) < str.length()){
		    while(str.charAt(k)==str.charAt(k+1)){
		    	k++;
		    	len++;
		    	
		    }
		    //k=k+len;
		    
		    tobe=str.substring(k-len, k);
		    }else{
		    	
		    }
		    sofar+= tobe +str.charAt(k);
			countAnagrams(rem,sofar,i);
		}
		}

		return i;
		}
}
