 public class operators{
    public static void main(String[] args) {

// Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("AO");
        System.out.println("add: " + (a + b));
        System.out.println("Sub : " + (a - b));
        System.out.println("multi: " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Mod: " + (a% b));

    //Assignment Operators 
        System.out.println("\nAssignment Operators");
        int x = 10;
        x += 5;  
        System.out.println("x += 5:" + x);

        x -= 3; 
        System.out.println("x-= 3: " + x);
        x *= 2; 
        System.out.println("x *= 2: " + x);

        x /=4;  
        System.out.println("x /= 4:" + x);

//Comparison Operators
        System.out.println("\nComp Oper");
        int p = 10, q = 20;

        System.out.println("p == q: " + (p == q));
        System.out.println("p != q: " + (p != q));
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p >= q: " + (p >= q));
        System.out.println("p <= q: " + (p <= q));

//Logical Operators 
        System.out.println(" Logical Oper");
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("AND (&&): " + (condition1 && condition2));
        System.out.println("OR (||): " + (condition1 || condition2));
        System.out.println("NOT (!): " + (!condition1));
    }
}