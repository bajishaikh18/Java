class GraduationAgeException extends Exception {
    public GraduationAgeException(String message) {
        super(message);
    }
}

public class GraduationEligibility {
    private int age;

    public GraduationEligibility(int age) {
        this.age = age;
    }

    public void verifyEligibility() throws GraduationAgeException {
        if (age < 17) { // Minimum age requirement
            throw new GraduationAgeException("Graduation denied: Student must be at least 17 years old.");
        } else {
            System.out.println("Graduation approved: Welcome, graduate!");
        }
    }

    public static void main(String[] args) {
        GraduationEligibility student1 = new GraduationEligibility(16);
        GraduationEligibility student2 = new GraduationEligibility(18);

        try {
            student1.verifyEligibility();
        } catch (GraduationAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            student2.verifyEligibility();
        } catch (GraduationAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All eligibility checks completed.");
    }
}