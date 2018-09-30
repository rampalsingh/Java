package programs;
//http://javaconceptoftheday.com/java-interview-programs-with-solutions/
public class C_How_do_you_remove_all_white_spaces_from_string_java {

	public static void main(String[] args) {

		String str = "  Core Java jsp servlets jdbc struts hibernate spring  ";

		// 1. Using replaceAll() Method
		String strWithoutSpace = str.replaceAll("\\s", "*");
		System.out.println(strWithoutSpace);

		
		// 2. Without Using replaceAll() Method
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}
		System.out.println(sb);
	}
}