package String_Basics;

public class OneShot {
    public static void main(String[] args) {
        String userName = "  Amit Kumar  ";
        String platform = "KodNest";

        // Using basic string methods
        System.out.println("Welcome, " + userName.trim() + " to " + platform + "!");

        // Checking if platform is equal to "KodNest"
        if (platform.equalsIgnoreCase("kodnest")) {
            System.out.println("You are on the best learning platform!");
        }

        // Using StringBuilder for efficient concatenation
        StringBuilder sb = new StringBuilder();
        sb.append(userName.trim());
        sb.append(" is learning Strings on ");
        sb.append(platform);
        System.out.println(sb.toString());

        // Demonstrating immutability
        String welcomeMessage = "Hello";
        welcomeMessage.concat(", " + userName.trim()); // Doesn't change welcomeMessage
        System.out.println("Immutability check: " + welcomeMessage); // Outputs "Hello"
    }
}