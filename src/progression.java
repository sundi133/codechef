import java.io.PrintWriter;
import java.util.Scanner;

public class progression{
	

	public static void main(String a[]){
		int i;
		//int array[] = {2,1,3,1,2};
		Scanner in2 = new Scanner(System.in);
		int M=in2.nextInt();

		PrintWriter pw = new PrintWriter(System.out, true);

		for(i = 0; i < M; i++){
			
			int a1=in2.nextInt();
			int b=in2.nextInt();
			int n=in2.nextInt();

			int x[]=new int[n+1];
			x[0]=1;
			int nInt=x[0] + 1;
			int inLoop=0;
			for(int k=1;k<n+1;k++){
				int i2=0;
				boolean notassigned=true;
				while(notassigned){
				notassigned=true;
				inLoop=0;
			    nInt = x[k - 1] +1 +i2;
				for(int i1=0;i1<k;i1++){
					for(int j=0;j<k;j++){
						if( nInt!=Math.abs((a1 * x[i1] - b * x[j] ))){
							
							x[k]=nInt;
		//					System.out.println(i1 +  " - "+ j +  " - " +k + " - " +nInt + " - " +  x[k - 1] + " - " +(a1 * x[i1] - b * x[j] ));
							notassigned=false;
							//nInt++;
							//inLoop=1;
							//break;
						}
						else{
			//				System.out.println(i1 +  " - "+ j +  " - " +k + " - " +nInt + " - " +  x[k - 1] + " - " +(a1 * x[i1] - b * x[j] ));
							notassigned=true;
							inLoop=1;
							break;
						}
							
					}
					if(inLoop==1)
						break;
				}
				i2++;
				}
			}
			for(int k1=0;k1<n;k1++)
				System.out.print(x[k1] + " ");

			System.out.println();
		}
		pw.close();


		//for(i = 0; i <array.length; i++)
		//	System.out.print(array[i]+"  ");

	}



}