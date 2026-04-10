import java.util.Scanner;

public class p_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double weightKg = weight * 0.45359237;
        double heightM = height * 0.0254;

        double bmi = weightKg / (heightM * heightM);

        System.out.println("BMI = " + bmi);
    }
}
