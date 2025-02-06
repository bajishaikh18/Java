package LeetCode;

public class justaclass {
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		String str2 = str.trim().toLowerCase().replaceAll(" ", "").replaceAll(",", "").replaceAll(":", "");
		System.out.println(str2);
	}
}
