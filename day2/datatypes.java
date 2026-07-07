public class datatypes {
    public static void main(String[] args) {

//Primitive Data Types 
        int age = 20;
        double height = 165.5;
        char grade = 'A';
        boolean isStudent = true;
        float cgpa = 8.7f;

//  Non-Primitive Data Types ( strings, arrays, classes, etc)
        String name = "Sarika";
        String[] subjects = {"Java", "Python", "SQL"};


        System.out.println("Primitive Data Types");
        System.out.println("Age : " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade : " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("CGPA:" + cgpa);


        System.out.println("Non-Primitive Data Types");
        System.out.println("Name: " + name);

        System.out.println("Subjects:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}