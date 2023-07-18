public class P_02_String_Methods {
    public static void main(String[] args) {
        String str = "Sushil Soniwal";

        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf('S'));
        System.out.println(str.contains("iwal"));
        System.out.println(str.replace('S', 'R'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("Sus"));
        System.out.println(str.endsWith("wal"));
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.substring(4));
        System.out.println(str.substring(2, 9));
    }
}