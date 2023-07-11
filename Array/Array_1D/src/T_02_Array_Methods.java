import java.util.Arrays;

public class T_02_Array_Methods {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 5, 7, 9, 12};

        // * To calculate the length of the array.
        int len = arr.length;
        System.out.println("The length of the array is:- " + len);

        // * To print an array.
        System.out.println(Arrays.toString(arr));

        // * Copy elements in a given range.
        int[] temp = Arrays.copyOfRange(arr, 1, 5);
        System.out.println(Arrays.toString(temp));

    }
}