import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter name of students");
        Scanner scan = new Scanner(System.in);
        int numStd = scan.nextInt();
        String[] students = new String[numStd];
        int[] age = new int[numStd];
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for (int i = 0; i < numStd; i++) {
            System.out.println("Enter name:");
            students[i] = scanName.nextLine();
            System.out.println("Enter age: ");
            age[i] = scanAge.nextInt();

        }

        for (int i = 0; i < numStd; i++) {
            if (age[i] >= 15) {
                System.out.println(students[i] + "vacine");
                System.out.println("Student now " + age[i]);
            }
        }
        scan.close();
        scanName.close();
        scanAge.close();
    }
}