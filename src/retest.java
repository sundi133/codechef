
public class retest {

	private static String EXAMPLE_TEST= "<TITLE>How a Regex Engine Works Internally</TITLE>";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String pattern = "(\\w)(\\s+)([\\.,])";
		//System.out.println(EXAMPLE_TEST.replaceAll(pattern, "</code>$3"));
		String pattern = "(?i)(<title.*>)(.+)(</title>)";
		String updated = EXAMPLE_TEST.replaceAll(pattern, "$2");
		System.out.println(updated);

	}

}
