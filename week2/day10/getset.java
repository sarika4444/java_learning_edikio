class getset {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if(age > 0) {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class Main {

    public static void main(String[] args) {

        getset
     s = new getset
    ();

        s.setName("Sarika");

        s.setAge(21);

        System.out.println(s.getName());

        System.out.println(s.getAge());

    }

}