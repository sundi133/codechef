import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

class test{


	public static void main(String[] a){
		int i;
		//int array[] = {2,1,3,1,2};
		Scanner in2 = new Scanner(System.in);
		String s1=in2.next();

		PrintWriter pw = new PrintWriter(System.out, true);

		ArrayList dic =new ArrayList();
		ArrayList secret =new ArrayList();
		String s=in2.nextLine();
		int dict=1;
		while(true){

				
			if(s.contains("secret")){
				dict=0;
				//continue;
			}
			System.out.println("sundi " + s);
			if(dict==1){
				//add to dict
				dic.add(s);
			}
			else{
				//add to secret msg
				secret.add(s);

			}
			s=in2.nextLine();
			if(s==null || s=="")
				break;

			if(secret.size()==1)
				break;
		}

		for(int j=0;j<secret.size();j++){
			System.out.println("sundi 2" + secret.get(j));
		}
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for(int k=0;k<secret.size();k++){
			String sec = (String) secret.get(k) ;
			for(int j =0;j<dic.size();j++){

				String dicti = (String) dic.get(j) ;

				System.out.println("sundi " + sec + dicti);
				if(dicti.length()!= sec.length())
					break;
				else{
					for(int m=0;m<sec.length();m++){
						if(sec.charAt(m) != dicti.charAt(m)){
							char c= sec.charAt(m);
							int value= hmap.get(c) +1;
							//String s= new String(c);
							((List) hmap).add(c,value);
							System.out.println("sundi " + c + value);
						}
							
					}
				}


			}
		}




	}


}