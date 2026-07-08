 public class strings {
    public static void main(String[] args) {

        String firstName = "Sarika";
        String lastName = "Reddy";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.substring(0, 6));
    }
}