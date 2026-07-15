class Parent {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";
    static String country = "India";
    final String college = "ABC College";

    public void showPrivate() {
        System.out.println(privateVar);
    }
}

class Child extends Parent {
    void display() {
        System.out.println(publicVar);      
        System.out.println(protectedVar);   
        System.out.println(defaultVar);     
        System.out.println(country);       
        System.out.println(college);        

    }
}

public class modifiers {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        System.out.println(Parent.country);   
        System.out.println(obj.college);
        obj.showPrivate();  
    }
}
