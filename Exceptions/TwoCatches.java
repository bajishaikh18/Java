public class TwoCatches {
	public static void main(String[] args) {
		String[] nums = {"1", "2", "3", "Four", "5"};
		int sum = 0;
		for(String ele:nums) {
			try {
				sum += Integer.parseInt(ele);
			} catch (NumberFormatException e){
				System.out.println("Input Error" + ele);
			} catch(NullPointerException e) {
				System.out.println("Null Values founded.");
			}
		}
		System.out.println("Total Sum: " + sum);
	}
}
