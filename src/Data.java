public class Data {
    public static void main(String[] args) {
        System.out.println("------Data types check---------");
        int myVar = 200;
        System.out.println(myVar);
        int newVar = 250;
        System.out.println(newVar);
        myVar = newVar;
        System.out.println("-------After reassignment-------");
        System.out.println(myVar);
        newVar = 150;
        System.out.println(newVar);
        System.out.println(myVar);
    }
}
