

	import java.io.PrintWriter;
import java.util.Random;
	import java.util.Scanner;
import java.util.Scanner;

	public class RepeatedString {


		static String assemblyString =new String();
		
		public static void main(String[] args) {
			
			
			
			
			Scanner in2 = new Scanner(System.in);
			//Scanner in3 = new Scanner(System.in);
			int M=in2.nextInt();
			int L=in2.nextInt();
			assemblyString = in2.next();
			PrintWriter pw = new PrintWriter(System.out, true);			
 
			
			while(M!=0 && L!=0){
			//System.out.println("" + M + L +assemblyString);


			
			
			pw.println(assemblyString + M + L);
			
			M=in2.nextInt();
			L=in2.nextInt();
			assemblyString = in2.next();
			
			
			
			}

			pw.close();
			return ;
		}

}


