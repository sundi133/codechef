import java.util.Scanner;


public class Grid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		int tot = in.nextInt();
		
		while(tot--!=0){
			long  xs=in.nextLong();
			long ys=in.nextLong();
			long xd=in.nextLong();
			long yd=in.nextLong();
			boolean res = reachable(xs,ys,xd,yd);
			if(res){
				System.out.println("YES");
				
			}
			else{
				System.out.println("NO");
			}
		}

	}

	private static boolean reachable(long xs, long ys, long xd, long yd) {
		// TODO Auto-generated method stub
		if(xs==xd && xd==yd)
			return true;
		if(reachable(xs, ys, ys, xs) ||
				reachable(xs, ys, xs, -ys) ||
				reachable(xs, ys, xs+ys, ys) ||
				reachable(xs, ys, 2*xs, ys) )
			return true;
		else
			return false;
	}

}
