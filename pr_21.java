import java.util.Scanner;

class VotingApp {

    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp v = new VotingApp();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            v.checkEligibility(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}
