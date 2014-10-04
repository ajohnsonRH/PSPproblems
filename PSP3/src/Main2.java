import java.util.Scanner;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String line = in.nextLine();
			String line2 = in.nextLine();
			System.out.println(IsWrap(line, line2));
		}
	}

	public static boolean IsWrap(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			int placeholder = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(0) == s2.charAt(i)) {
					placeholder = i;
					break;
				}
			}
			String temp = s2.substring(placeholder, s2.length())
					+ s2.substring(0, placeholder);
			System.out.println(s1+" : "+temp);
			if (temp.equals(s1)) {
				return true;
			} else {
				return false;
			}

		}

	}

}
