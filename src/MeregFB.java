import java.util.ArrayList;


public class MeregFB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,4, 3 ,1};
		merge_sort(arr,0,arr.length);
	}

	private static int[] merge_sort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
			
		 	int  n = hi-lo+1;
		    if( n <= 1){
		    	int [] rarr = new int[1];
		    	rarr[0]=arr[lo];
		        return rarr;
		    }
		        

		    System.out.println(lo + " " +hi);
		    // arr is indexed 0 through n-1, inclusive
		    int mid = (int) Math.floor((lo+hi)/2);
		    
		    int[] first_half = merge_sort(arr,lo,mid-1);
		    int[] second_half = merge_sort(arr,mid,hi-1);
		    return merge(first_half, second_half);
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] res = new int[arr1.length + arr2.length +1];
		     
		ArrayList result = new ArrayList();
		while( arr1.length > 0 && arr2.length > 0){
		              if(arr1[0] < arr2[0]){
		                  System.out.print('1'); // for debugging
		                  result.add(arr1[0]);
		                  arr1=remove_first(arr1);
		              }
		              else{
		            	  System.out.print('2');
		              	  result.add(arr2[0]);
		                  arr2=remove_first(arr2);
		              }
		                  
		}
		for(int k=0;k<arr1.length;k++){
			result.add(arr1[0]);
		}
		for(int k=0;k<arr2.length;k++){
			result.add(arr2[0]);
		}
		 
		for(int k=0;k<result.size();k++){
			res[k]=(Integer) result.get(k);
		}
		return res;
	}

	private static int[] remove_first(int[] arr) {

		int[] res= new int[arr.length-1];
		if(arr.length==1)
			return res;
		for(int k=0;k<arr.length-1;k++){
			res[k]=arr[k+1];
		}
		return res;
		
		
	}

}
