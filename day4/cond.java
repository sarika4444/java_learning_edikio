public class cond {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");}
         else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        int age = 20;

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
