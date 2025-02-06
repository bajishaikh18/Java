package LeetCode;

class Solutionwaz {
	public boolean isPalindrome(String s) {
		s.trim().toLowerCase().replaceAll(" ", "").replaceAll(",", "").replaceAll(":", "");
		String rev = new String();
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev==s) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(str);
		
	}
}


