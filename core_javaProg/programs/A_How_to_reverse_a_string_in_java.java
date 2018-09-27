package programs;
//http://javaconceptoftheday.com/java-interview-programs-with-solutions/
public class A_How_to_reverse_a_string_in_java {
	public static void main(String[] args) {
		// Using StringBuffer class
		StringBuffer sb = new StringBuffer("rampal");
//		System.out.println(sb.reverse());

		// Using iterative method
		String str = "Hellow World";
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
//			System.out.println(strArray[i]);
		}

		// Using recursive method
//		System.out.println(recursiveMethod("recursiveMethod"));
		System.out.println(recursiveMethod("singh"));
	}

	public static String recursiveMethod(String str) {
		if ((str == null) || str.length() <= 1) {
			return str;
		}
//		System.out.println(str);
		String a = str.substring(1);
		char b = str.charAt(0);
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}