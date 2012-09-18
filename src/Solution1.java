import java.util.Scanner;


class StackX
{
	private final int SIZE = 50;
	private int[] st;
	private int top;
	// ------------------------------------------------------------
	public StackX()           // constructor
	{
		st = new int[SIZE];    // make array
		top = -1;
	}
	// ------------------------------------------------------------
	// ------------------------------------------------------------
	public int pop()          // take item off stack
	{ 

		int tmp = st[top];
		top--;
		return tmp; 

	}
	// ------------------------------------------------------------
	public int peek()         // peek at top of stack
	{ return st[top]; }
	// ------------------------------------------------------------
	public boolean isEmpty()  // true if nothing on stack
	{ return (top == -1); }

	public int numberOfElements()  // true if nothing on stack
	{ 
		return (top + 1); 
	}
	// ------------------------------------------------------------
	public void push(int root) {
		// TODO Auto-generated method stub
		top++;
		st[top] = root;
		return;
	}

}  // end class StackX

public class Solution1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int[] str = new int[n];
		int[] end = new int[n];
		int i=0;
		
		while(i<n){
			str[i]=in.nextInt();
			
		i++;
		}
		i=0;
		while(i<n){
			end[i]=in.nextInt();
			i++;
		}
		
		i=n-1;
		StackX[] strst = new StackX[10];
		StackX[] endst = new StackX[10];
		for(int j=0;j<strst.length;j++){
			StackX st= new StackX();
			strst[j] = st;
		}
		for(int j=0;j<strst.length;j++){
			StackX st= new StackX();
			endst[j] = st;
		}
		
		while(i>=0){
			
			strst[str[i]].push(i);
			i--;
			
		}
		i=n-1;
		while(i>=0){
			endst[end[i]].push(i);
			i--;
		}
		//printStacks(strst);
		calcumin(str,end,str,0,strst,endst,"");
		

	}

	private static void printStacks(StackX[] strst) {


		for(int k=0;k<strst.length;k++){
			while(!strst[k].isEmpty())
				System.out.println(k + " "+ strst[k].pop());
		}
		
	}

	private static void calcumin(int[] str, int[] end, int[] conf,int steps, StackX[] strst, StackX[] endst, String string) {
		
		System.out.print(steps);
		
		if(equals(strst,endst)){
			System.out.println(steps);
			System.out.println(string);
			return;
		}
		printStacks(strst);
		for(int i=0;i<strst.length;i++){
			for(int j=0;j<strst.length;j++){
				if(j!=i){
					if(!strst[i].isEmpty()){
					while(!strst[i].isEmpty()){
					if(strst[i].peek()<strst[j].peek()){
					strst[j].push(strst[i].pop());
					calcumin(str,end,str,steps+1,strst,endst,string + i + " " + j + "\n");
					}
					}
					}else {
						if(!strst[j].isEmpty()){
							strst[j].push(strst[i].pop());
							calcumin(str,end,str,steps+1,strst,endst,string + i + " " + j + "\n");
						}
					}
				}
			}
		}
		
	}

	private static boolean equals(StackX[] strst, StackX[] endst) {
		// TODO Auto-generated method stub
		System.out.println("1");
		printStacks(strst);
		System.out.println("2");
		printStacks(endst);
		for(int i=0;i<strst.length;i++){
			while(!strst[i].isEmpty() && !endst[i].isEmpty()){
				if(strst[i].peek()==endst[i].peek()){
					strst[i].pop();
					endst[i].pop();
					if(strst[i].isEmpty() && !endst[i].isEmpty())
						return false;
					if(!strst[i].isEmpty() && endst[i].isEmpty())
						return false;
				}
			}
			
			
		}
		return true;
	}

}
