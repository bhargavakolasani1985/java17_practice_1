public class StringBuilderTest1 {
    public static void main(String[] args) {
        var letters = new StringBuilder("abcdefg");
        System.out.println(letters.substring(1, 2));
        System.out.println(letters.substring(1, 1));
        System.out.println(letters.substring(2, 1));
    }
}