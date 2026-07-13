public class arrayintro {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        int[] marks = {90,85,78,92,88};
        System.out.println("length: " + marks.length);

        int[] ranks = {90,85,78};
        ranks[1] = 100;
        System.out.println(" Modifying: " + ranks[1]);


        int[] s = {90,85,78};
        System.out.println("Accessing invalid index: " + s[5]);
    }
}