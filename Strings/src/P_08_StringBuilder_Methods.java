public class P_08_StringBuilder_Methods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Sushil");

        System.out.println(sb); // Sushil
        System.out.println(sb.append("JAVA")); // SushilJAVA
        System.out.println(sb.insert(2, "CPP")); // SuCPPshilJAVA
        System.out.println(sb.replace(1, 3, "Python")); // SPythonPPshilJAVA
        System.out.println(sb.delete(1, 4)); // ShonPPshilJAVA
        System.out.println(sb.reverse()); // AVAJlihsPPnohS
    }
}
