package String_Basics;

public class HussexHack {
	public static void main(String[] args) {
		String str1 = "baji";
		String str2 = "iajb";
		System.out.println(check(str1, str2));
	}
	
	public static boolean check(String str1, String str2) {
		if((str1.charAt(0)==str2.charAt(str2.length()-1)) && (str1.charAt(str1.length()-1)==str2.charAt(0)) ) {
			return true;
		}
		return false;
	}
}
