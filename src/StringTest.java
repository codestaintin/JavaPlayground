public class StringTest {
    public static void main(String[] args) {
        String s1 = "I love";
        s1 += " Java";

        String s2 = "I love";
        s2 += " Java";

        if (s1.equals(s2))
            System.out.println("Both strings are equal");

        String s3 = s1.intern();
        String s4 = s2.intern();

        if (s3 == s4)
            System.out.println("Using the intern method they are now equal");

        System.out.println(s1);
        System.out.println(s2);

    }
}
