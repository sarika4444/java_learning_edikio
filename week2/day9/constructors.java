public class constructors
{

    String name;
    int age;

    constructors(String n, int a)
    {
        name = n;
        age = a;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args)
    {

        constructors s1 = new constructors("Sarika",21);

        constructors s2 = new constructors("Rahul",22);

        s1.display();

        s2.display();

    }
Student
Student
Student
Student
Student
Student
}