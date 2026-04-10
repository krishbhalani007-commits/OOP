import java.util.Scanner;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void displayData() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        College col = new College("SSASIT");

        College.Admission adm = col.new Admission();

        adm.readData();
        adm.displayData();
    }
}
