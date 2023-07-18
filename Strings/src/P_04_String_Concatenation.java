public class P_04_String_Concatenation {

    // * (1) By using "Concatenation" (+) Operator.
    public static void First() {
        String s1 = "Sushil";
        String s2 = "Soniwal";
        System.out.println(s1 + s2); // SushilSoniwal
    }

    // * (2) By using (.concat()) Method.
    public static void Second() {
        String s1 = "Sushil";
        String s2 = "Soniwal";
        System.out.println(s1.concat(s2)); // SushilSoniwal
    }

    public static void main(String[] args) {
        First();
        Second();
    }
}
