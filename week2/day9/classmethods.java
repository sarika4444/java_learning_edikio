public class classmethods
{

    String name;
    int age;

    void study()
    {
        System.out.println("student is studying");
    }

    public static void main(String[] args)
    {

        classmethods s1 = new classmethods();

        s1.study();

    }

}