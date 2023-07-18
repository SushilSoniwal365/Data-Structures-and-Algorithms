public class P_05_String_Immutability {

    public static void main(String[] args) {

        String name = "Sushil";
        name.concat("Soniwal");
        System.out.println(name);

        /* Output => "Sushil";
        A new object "SushilSoniwal" is created in pool but 'name' still refers to old
        one i.e. "Sushil". */

        String str = "Sushil";
        str = str.concat("Soniwal");
        System.out.println(str);

        /* Output => "SushilSoniwal";
        A new object "SushilSoniwal" is created in pool and 'str' refer to new one
        i.e. "SushilSoniwal". */
    }
}
