import java.io.IOException;
public class RunCalculator
{
  public static void main(String[]args)
  {
   try
   {
	   String arr = "calc";
	   Runtime x = Runtime.getRuntime();
	   x.exec(arr);

	   
	}
	catch(IOException e)
	{System.err.println("Didn't work");}
  }
}
