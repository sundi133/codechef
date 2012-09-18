import java.io.PrintWriter;
import java.util.Scanner;

public class Isort{
	public static int swap=0;

	public static void main(String a[]){
		int i;
		//int array[] = {2,1,3,1,2};
		Scanner in2 = new Scanner(System.in);
		int M=in2.nextInt();

		PrintWriter pw = new PrintWriter(System.out, true);

		for(i = 0; i < M; i++){
			int L=in2.nextInt();

			int t=0;
			int[] array = new int[L];
			while(t<L){

				array[t]=in2.nextInt();
				t++;
			}

			for(int j=0;j<array.length;j++){
				insertion_srt(array, array.length);
			}
			//System.out.println(swap);
			pw.println(swap);
			swap=0;

		}
		pw.close();


		//for(i = 0; i <array.length; i++)
		//	System.out.print(array[i]+"  ");

	}

	public static void insertion_srt(int array[], int n){
		for (int i = 1; i < n; i++){
			int j = i;
			int B = array[i];
			while ((j > 0) && (array[j-1] > B)){
				array[j] = array[j-1];
				j--;
				swap++;//System.out.print(array[i]+"  ");
			}
			array[j] = B;
		}

	}
}