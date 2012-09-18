import java.util.Scanner;


public class dates {

	/**
	 * @param args
	 */
	public static int[] months={1,2,3,4,5,6,7,8,9,10,11,12};
	public static int[][] days=
			  {
		      {1,31},
			  {2,29},
			  {3,31},
			  {4,30},
			  {5,31},
			  {6,30},
			  {7,31},
			  {8,31},
			  {9,30},
			  {10,31},
			  {11,30},
			  {12,31}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String dates= in.next();
		
		printAllDatesFrom(dates);
		
	}

	private static void printAllDatesFrom(String date) {
		// TODO Auto-generated method stub

		String[] dates= date.split("/");
		int m= Integer.parseInt(dates[0]);
		int d= Integer.parseInt(dates[1]);
		int y= Integer.parseInt(dates[2]);
		if(y%4==0){//leap year
			printdates(m,d,y,1,dates);
		}else{
			printdates(m,d,y,0,dates);
		}

	}

	private static void printdates(int m, int d, int y, int leap_year, String[] dates) {
		// TODO Auto-generated method stub
		for(int k=0;k<months.length;k++){
			int day_num=0;
		    if(y==leap_year && k==1){
				day_num=days[k][1]-1;
			}else{
				day_num=days[k][1];
			}
			for(int i=0;i<day_num;i++){
				if(!(Integer.parseInt(dates[0])==k+1 && Integer.parseInt(dates[1])==i+1 && Integer.parseInt(dates[2])==y))
					System.out.println( (k+1)+"/" +(i+1)+ "/" + y+"");
				else{
					return ;
				}
			}
		}
		
	}

}
