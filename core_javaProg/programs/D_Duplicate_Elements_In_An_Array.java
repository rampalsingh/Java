package programs;

import java.util.HashSet;

public class D_Duplicate_Elements_In_An_Array {

	public static void main(String[] args) {

		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}

}
