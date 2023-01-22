import java.util.Arrays;

public class StringTest2 {
    public static void main(String[] args) {
        var arr = new String[] { "PIG", "pig", "123", "Pippa"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Pippa"));
    }
}